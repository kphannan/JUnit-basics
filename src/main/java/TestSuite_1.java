import org.junit.*;

/**
 * Created by kevin on 7/28/2017.
 */
public class TestSuite_1 {

    @BeforeClass
    public static void beforeClass()
    {
        System.out.println( "Before class");
    }

    @Before
    public void beforeTest()
    {
        System.out.println( "Before test");
    }

    @Test
    public void test1()
    {
        System.out.println( "TestSuite_1 Test 1");
    }

    @Test
    public void test2()
    {
        System.out.println( "TestSuite_1 Test 2");
    }


    @After
    public void afterTest()
    {
        System.out.println( "After test");
    }

    @AfterClass
    public static void afterClass()
    {
        System.out.println( "After class");
    }


}
