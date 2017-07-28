import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

/**
 * Created by kevin on 7/28/2017.
 */
public class TestRules {

    @Rule
    public Retry retry = new Retry( 3 );


    @BeforeClass
    public static void beforeClass()
    {
        System.out.println( "TestRules Before class");
    }

    @Before
    public void beforeTest()
    {
        System.out.println( "TestRules Before test");
    }


    @After
    public void afterTest()
    {
        System.out.println( "TestRules After test");
    }

    @AfterClass
    public static void afterClass()
    {
        System.out.println( "TestRules After class");
    }

    @Rule
    public TestRule listen = new TestWatcher() {

        @Override
        protected void failed(Throwable t, Description description ) {
            // Logic for handling failed tests
            System.out.println( "Test: " + description.getMethodName() + " FAILED" );
        }

        @Override
        protected void succeeded( Description description) {
            // Logic for handling passing tests
            System.out.println( "Test: " + description.getMethodName() + " PASSED" );
        }
    };
}
