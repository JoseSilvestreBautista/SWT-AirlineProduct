import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
    UnitTestSuite.class,
    IntegrationTestSuite.class,
    GUITestSuite.class,
    PerformanceTestSuite.class
})

public class AllTestSuites {

}
