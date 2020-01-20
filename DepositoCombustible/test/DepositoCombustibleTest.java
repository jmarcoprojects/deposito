import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible tank = new DepositoCombustible (40.0,10.0);
		double depositoNivel=tank.getDepositoNivel();
		assertEquals(10.0,depositoNivel,0.1);
	}

	@Test
	public void testGetDepositoMax() {
		DepositoCombustible tank = new DepositoCombustible (40.0,10.0);
		double depositoMax=tank.getDepositoMax();
		assertEquals(40.0,depositoMax,0.1);
	}

	@Test
	public void testEstaVacio() {
		DepositoCombustible tank = new DepositoCombustible (40.0,0.0);		
		assertEquals(true,tank.estaVacio());
	}

	@Test
	public void testEstaLleno() {
		DepositoCombustible tank = new DepositoCombustible (40.0,15.0);		
		assertEquals(false,tank.estaLleno());
	}

	/*@Test
	public void testFill() {
		fail("No implementado aun");
	}

	@Test
	public void testConsumir() {
		fail("No implementado aun");
	}*/

}
