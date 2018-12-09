package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {

	public PreparedStatement stmt;
	public ResultSet rs;
	public Connection con;

	public void open() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/astral", "root", "root");
	}

	public void close() throws Exception {
		con.close();
	}

	public static void main(String[] args) {
		try {
			Dao dao = new Dao();
			dao.open();
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("erro");
		}

	}
}
