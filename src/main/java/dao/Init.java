package dao;

import java.math.BigDecimal;

import entity.Cliente;
import entity.Produto;

public class Init {

	public void insereCliente() throws Exception {
		Cliente cliente = new Cliente(null, "bruno", "123");
		DaoHibernate<Cliente> dao = new DaoHibernate<Cliente>();
		dao.create(cliente);
	}

	public void insereProduto() throws Exception {
		Produto produto1 = new Produto("item 1", new BigDecimal(10), 5);
		Produto produto2 = new Produto("item 2", new BigDecimal(10), 5);
		Produto produto3 = new Produto("item 3", new BigDecimal(10), 5);
		Produto produto4 = new Produto("item 4", new BigDecimal(10), 5);
		Produto produto5 = new Produto("item 5", new BigDecimal(10), 5);
		DaoHibernate<Produto> dao = new DaoHibernate<Produto>();
		dao.create(produto1);
		dao.create(produto2);
		dao.create(produto3);
		dao.create(produto4);
		dao.create(produto5);
	}

	public static void main(String[] args) {
		try {
			Init init = new Init();
			init.insereCliente();
			init.insereProduto();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
