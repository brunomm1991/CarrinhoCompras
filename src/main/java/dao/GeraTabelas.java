package dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//Classe JPA para gerar tabelas 
public class GeraTabelas {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("stone");
		factory.close();
	}
}