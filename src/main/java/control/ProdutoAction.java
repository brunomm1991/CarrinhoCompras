package control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.DaoHibernate;
import entity.Produto;

public class ProdutoAction extends ActionSupport {
	private static final long serialVersionUID = -6589224660368614090L;
	private DaoHibernate<Produto> dao = new DaoHibernate<Produto>();
	List<Produto> produtos = null;
	Produto produto = new Produto();

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public String adicionar() {
		try {
			HttpServletRequest request = (HttpServletRequest) ActionContext.getContext()
					.get(ServletActionContext.HTTP_REQUEST);
			dao.create(produto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String execute() throws Exception {
		produtos = dao.findAll(Produto.class);

		return SUCCESS;
	}

}
