import org.junit.*;

/**
 * Created by kevin on 7/28/2017.
 */
public class TestSuite_2 {

    @BeforeClass
    public static void beforeClass()
    {
        System.out.println( "TestSuite_2 Before class");
    }

    @Before
    public void beforeTest()
    {
        System.out.println( "TestSuite_2 Before test");
    }

    @Test
    public void test1()
    {
        System.out.println( "TestSuite_2 Test 1");
    }

    @Test
    public void test2()
    {
        System.out.println( "TestSuite_2 Test 2");
    }


    @After
    public void afterTest()
    {
        System.out.println( "TestSuite_2 After test");
    }

    @AfterClass
    public static void afterClass()
    {
        System.out.println( "TestSuite_2 After class");
    }


}
