import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.*;

/**
 * Created by kevin on 7/28/2017.
 */
public class TestSuite_2 extends TestRules {

    private static Logger log = LogManager.getLogger();


    @Test
    public void test1()
    {
        log.trace("TestSuite_2 Test 1");
    }

    @Test
    public void test2()
    {
        log.trace("TestSuite_2 Test 2");
    }

}
