import org.junit.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Created by kevin on 7/28/2017.
 */
public class TestSuite_1 extends TestRules {

    private static Logger log = LogManager.getLogger();

    @Test
    public void test1()
    {
        log.trace( "TestSuite_1 Test 1");
//        Assert.assertTrue( false );
    }

    @Test
    public void test2()
    {
        log.trace( "TestSuite_1 Test 2");
    }
}
