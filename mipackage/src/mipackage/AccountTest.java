package mipackage;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AccountTest {
	@Test
	@DisplayName(value = "INGRESAR DINERO EN CUENTA")
	void testIngresar() throws Exception {
		Account Cantidad = new Account(10);
		Cantidad.ingresar(150);
		// fail("Not yet implemented");
	}

	@Test
	@DisplayName(value = "RETIRAR DINERO DE LA CUENTA")
	void testRetirar() throws Exception {
		Account Cantidad = new Account(10);
		Cantidad.retirar(0);
		// fail("Not yet implemented");
	}

	@Test
	@DisplayName(value = "RETIRAR DINERO DE LA CUENTA")
	void testComprar() throws Exception {
		Account Cantidad = new Account(10);
		Cantidad.retirar(0);
		// fail("Not yet implemented");
	}

	@Test
	@DisplayName(value = "Balance=0")
	void testCovid19() throws Exception {
		Account Balanace = new Account(0);
		Balanace.retirar(0);
		// fail("Not yet implemented");
	}
}