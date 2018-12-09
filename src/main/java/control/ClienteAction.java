package control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.DaoHibernate;
import entity.Cliente;

public class ClienteAction extends ActionSupport {
	private static final long serialVersionUID = -6589224660368614090L;
	private DaoHibernate<Cliente> dao = new DaoHibernate<Cliente>();
	List<Cliente> clientes = null;
	Cliente cliente = new Cliente();

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public String adicionar() {
		try {
			HttpServletRequest request = (HttpServletRequest) ActionContext.getContext()
					.get(ServletActionContext.HTTP_REQUEST);
			dao.create(cliente);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String execute() throws Exception {
		clientes = dao.findAll(Cliente.class);

		return SUCCESS;
	}

}