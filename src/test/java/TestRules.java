import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by kevin on 7/28/2017.
 */
public class TestRules {

    private static Logger  log = LogManager.getLogger();

    @Rule
    public Retry retry = new Retry( 3 );


    @BeforeClass
    public static void beforeClass()
    {
        log.trace( "TestRules Before class");
    }

    @Before
    public void beforeTest()
    {
        log.trace( "TestRules Before test");
    }


    @After
    public void afterTest()
    {
        log.trace( "TestRules After test");
    }

    @AfterClass
    public static void afterClass()
    {
        log.trace( "TestRules After class");
    }

    @Rule
    public TestRule listen = new TestWatcher() {

        @Override
        protected void failed(Throwable t, Description description ) {
            // Logic for handling failed tests
            log.error( "Test: " + description.getMethodName() + " FAILED" );
        }

        @Override
        protected void succeeded( Description description) {
            // Logic for handling passing tests
            log.info( "Test: " + description.getMethodName() + " PASSED" );
        }
    };
}
