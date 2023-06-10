package DAO;

import java.sql.Connection;

import conexaojdbc.SingleConnection;

public class UserPosDAO {
	
	private class UsePosDAO {
		private Connection connection;
		
		public UsePosDAO() {
			connection = SingleConnection.getConnection();
		}
	}
	
	public void salvar() {
		
	}

} 
