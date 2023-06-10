package pos_java_jdbc4.pos_java_jdbc4;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import junit.framework.TestCase;

public class TesteBancoJdbc {
	
	@Test
	public void initBanco() {
		SingleConnection.getConnection();
	}

}
