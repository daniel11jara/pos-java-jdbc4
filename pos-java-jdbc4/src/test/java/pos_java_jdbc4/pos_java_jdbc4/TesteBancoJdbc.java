package pos_java_jdbc4.pos_java_jdbc4;

import java.util.Iterator;
import java.util.List;


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
	
	@Test
	public void initListar() {
		UserPosDAO dao = new UserPosDAO();
		
		try {
			List<Userposjava> list = dao.listar();
			
			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("---------------------------------");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Test
	public void initBuscar() {
		UserPosDAO dao = new UserPosDAO();
		
		try {
			Userposjava userposjava = dao.buscar(1L);
			System.out.println(userposjava);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
