import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by kevin on 7/28/2017.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses( {
        TestSuite_1.class,
        TestSuite_2.class,
        TestSuite_3.class,
        BasicsTest.class,
        BasicsTestAnnotation.class,
        BasicsAssert.class,
        BasicsTestFlow.class,
        junit.examples.AdderTest.class
})
public class TestPrimer {
}
