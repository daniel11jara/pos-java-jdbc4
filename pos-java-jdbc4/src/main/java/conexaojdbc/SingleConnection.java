package conexaojdbc;

import java.sql.Connection;

public class SingleConnection {
	
	private static String banco = "";
	private static String password = "";
	private static String user = "";
	private static Connection connection = null;
	
	static {
		conectar();
	}
	
	public SingleConnection() {
		conectar();
	}
	
	
	private static void conectar() {
		try {
			
			if (connection == null) {
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}

}
