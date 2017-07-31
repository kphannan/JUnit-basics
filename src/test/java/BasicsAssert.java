import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 */
public class BasicsAssert {
    private static Logger log = LogManager.getLogger();

    @Test
    public void exampleAssertTrue()
    {
        Assert.assertTrue( true );
    }

    @Test
    public void exampleAssertFalse()
    {
        Assert.assertFalse( false );
    }


    @Test
    public void exampleNull()
    {
        Object o = null;

        Assert.assertNull( o );
    }

    @Test
    public void exampleNotNull()
    {
        Object o = "Kilroy was here";

        Assert.assertNotNull( o );
    }



    @Test
    public void exampleAssertEquals()
    {
        String testValue = "expected Value";

        Assert.assertEquals( "expected Value", testValue );
    }

    @Test
    public void exampleAssertSame()
    {
        String expectedValue = "expected Value";
        String testValue     = expectedValue;

        Assert.assertSame( expectedValue, testValue );
    }



}
