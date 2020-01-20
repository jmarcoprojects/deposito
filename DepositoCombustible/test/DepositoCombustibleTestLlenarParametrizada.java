import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DepositoCombustibleTestLlenarParametrizada {

		private double nivel;
		private double cantidad;
		private double estado;
		
		public DepositoCombustibleTestLlenarParametrizada(double niv, double can, double est) {
			this.nivel = niv;
			this.cantidad = can;
			this.estado = est;
		}
		
		@Parameters 
		public static Collection<Object[]> consumos() {
			return Arrays.asList(new Object[][] {
				{30.0,5.0,35.0},{50.0,0.0,50.0},{50.0,-10.0,40.0},{50.0,10.0,60.0}});
		}	
		
		@Test
		public void testConsumir() {
			DepositoCombustible tank = new DepositoCombustible (50.0,nivel);
			tank.fill(cantidad);
			double res = tank.getDepositoNivel();
			assertEquals(estado,res,0.0);
		}

}