import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DepositoCombustibleTest.class, DepositoCombustibleTestLlenarParametrizada.class,
		DepositoCombustibleTestParametrizada.class })
public class AllTests {

}
