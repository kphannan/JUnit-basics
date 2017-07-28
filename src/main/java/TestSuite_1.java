import org.junit.*;

/**
 * Created by kevin on 7/28/2017.
 */
public class TestSuite_1 extends TestRules {

    @Test
    public void test1()
    {
        System.out.println( "TestSuite_1 Test 1");
        Assert.assertTrue( false );
    }

    @Test
    public void test2()
    {
        System.out.println( "TestSuite_1 Test 2");
    }
}
