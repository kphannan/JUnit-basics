import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by kevin on 7/30/2017.
 */
public class BasicsTestFlow {

    private static Logger log = LogManager.getLogger();

    @BeforeClass
    public static void beforeAllTests()
    {
        log.trace( "beforeAllTests (beforeClass)" );
    }

    @Before
    public void beforeEachTest()
    {
        log.trace( "pre-test (setUp)" );
    }




    @Test
    public void testOne()
    {
        log.trace( "testOne()" );
    }

    @Test
    public void testTwo()
    {
        log.trace( "testTwo()" );
    }

    @Test
    public void testThree()
    {
        log.trace( "testThree()" );
    }


    @After
    public void afterEachTest()
    {
        log.trace( "post-test (tearDown)" );
    }

    @AfterClass
    public static void afterAllTests()
    {
        log.trace( "afterAllTests (afterClass)" );
    }

}
