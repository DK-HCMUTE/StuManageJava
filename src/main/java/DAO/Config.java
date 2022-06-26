package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class Config {
	public static Connection getConnection()  {
		try {
			String url = "jdbc:sqlserver://ADMIN\\SQLEXPRESS:1433;databaseName=JDBC_test;encrypt=true;trustServerCertificate=true;";
			String uname = "sa";
			String pass = "k989898k";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(url, uname, pass);
			return conn;
		}
		catch(Exception e) {
			e.getMessage();
		}
		return null;
		
	}
	public Config() {
	}
}
