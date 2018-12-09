package dao;

import entity.Cliente;

public class TesteDao {
	private DaoHibernate<Cliente> dao = new DaoHibernate<Cliente>();

	public void lista() {
		System.out.println(dao.findAll(Cliente.class));
	}

	public static void main(String[] args) {
		new TesteDao().lista();
	}
}
