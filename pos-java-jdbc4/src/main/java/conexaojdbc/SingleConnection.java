package conexaojdbc;

import java.sql.Connection;

import java.sql.DriverManager;

public class SingleConnection {
	
	private static String url = "jdbc:postgresql://localhost:5433/posjava";
	private static String password = "admin";
	private static String user = "postgres";
	private static Connection connection = null;
	
	static {
		conectar();
	}
	
	public SingleConnection() {
		conectar();
	}
	
	
	private static void conectar() {
		try {
			
			if (connection == null) {// se a conexao for igual a nula, vai conectar, se não, não faz nada
				Class.forName("org.postgresql.Driver"); //carregando o drive do postgre
				connection = DriverManager.getConnection(url, user, password);
				connection.setAutoCommit(false);//não vai salvar automaticamente, usuario decide se a operacao vai ser salva
				System.out.println("conectou com sucesso");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}

}
