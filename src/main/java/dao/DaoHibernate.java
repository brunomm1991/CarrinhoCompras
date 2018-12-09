package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Cliente;

public class DaoHibernate<Entity> {

	Session session;
	Transaction transaction;
	Criteria criteria;
	Query query;
	Entity entity;

	public void create(Entity entity) throws Exception {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.save(entity);
		transaction.commit();
		session.close();
	}

	public void update(Entity entity) {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.update(entity);
		transaction.commit();
		session.close();
	}

	public List<Entity> findAll(Class<Entity> classe) {
		session = HibernateUtil.getSessionFactory().openSession();
		criteria = session.createCriteria(classe);
		return session.createQuery("from " + classe.getSimpleName()).list();
	}

	public Object findByCode(Class<Entity> classe, int id) throws InstantiationException, IllegalAccessException {
		session = HibernateUtil.getSessionFactory().openSession();
		Object resp = session.get(classe, id);
		resp = (resp == null) ? classe.newInstance() : resp;
		session.close();
		return resp;
	}

	public void remove(Entity entity) {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.delete(entity);
		transaction.commit();
		session.close();
	}

	public void close() {
		session.close();
	}

	public static void main(String[] args) {
		List<Cliente> clientes = new DaoHibernate<Cliente>().findAll(Cliente.class);
		System.out.println(clientes);
	}
}
