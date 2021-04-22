import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
    addCustomerTest.class,
    addFlightTest.class,
    LoginTest.class,
    MainTest.class,
    searchCustomerTest.class,
    ticketreportTest.class,
    ticketTest.class,
    userCreationTest.class
})

public class UnitTestSuite {

}
