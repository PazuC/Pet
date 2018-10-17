package petDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBase {
	Connection c = null;
	Statement stmt = null;

	DataBase() {
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:petDataBase.db");

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
	}

	public void CreateTable() {
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:petDataBase.db");
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			String sql = "CREATE TABLE PET " + "(ID INT PRIMARY KEY     NOT NULL,"
					+ " NAME           TEXT    NOT NULL, " + " PET           CHAR(50)	 NOT NULL)";
			stmt.executeUpdate(sql);
			stmt.close();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Table created successfully");
	}


	public void closeConnection() {
		try {
			c.close();
		} catch (Exception e) {

		}
	}

	public void executeQuery(String sql) {
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:petDataBase.db");
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");
			this.stmt = c.createStatement();
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Records created successfully");
	}


	public String CheckPet(String student_name) {//find by student name
		try {
			c.setAutoCommit(false);
			this.stmt = c.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM PET WHERE NAME = '" + student_name +"'");

			while (rs.next()) {
				String pet = rs.getString("pet");
				return pet;
			}
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		return student_name;
	}
}
