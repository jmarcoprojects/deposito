import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public class DepositoCombustibleTestParametrizada {

	private double nivel, consumo, estado;
	
	public DepositoCombustibleTestParametrizada(double niv, double con, double est) {
		this.nivel = niv;
		this.consumo = con;
		this.estado = est;
	}
	
	@Parameters 
	public static Collection<Object[]> consumos() {
		return Arrays.asList(new Object[][] {
			{40.0,10.0,30.0},{30.0,30.0,0.0},{15.0,-5.0,20.0},{10.0,40.0,-30.0}
		});
	}	
	
	@Test
	public void testConsumir() {
		DepositoCombustible tank = new DepositoCombustible (50.0,nivel);
		tank.consumir(consumo);
		double es = tank.getDepositoNivel();
		assertEquals(estado,es,0.0);
	}
}


