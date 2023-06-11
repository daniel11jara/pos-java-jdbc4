package pos_java_jdbc4.pos_java_jdbc4;

import org.junit.Test;


import DAO.UserPosDAO;
import conexaojdbc.SingleConnection;
import junit.framework.TestCase;
import model.Userposjava;

public class TesteBancoJdbc {
	
	@Test
	public void initBanco() {
		UserPosDAO userPosDAO = new UserPosDAO();//instanciando o DAO
		Userposjava userposjava = new Userposjava();
		
		userposjava.setId(5L);
		userposjava.setNome("matheus");
		userposjava.setEmail("matheus@gmail.com");
		
		userPosDAO.salvar(userposjava);
	}

}
