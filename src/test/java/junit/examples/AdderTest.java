package junit.examples;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdderTest {
//    private static Logger log = LogManager.getLogger();

    private Adder adder;

    @Before
    public void make_Adder()
    {
        adder = new Adder();
    }

    @Test
    public void addOneAndThree()
    {
        Assert.assertEquals( 4, adder.add( 1, 3 ));
    }

    @Test
    public void addOneAndZero()
    {
        Assert.assertEquals( 1, adder.add( 1, 0 ));
    }

    @Test
    public void checkResultAfterTwoAdds()
    {
        // Add 2 + 2 =  4, add to running total ( 4)
        Assert.assertEquals( 4, adder.add( 2, 2 ));
        // Add 7 + 8 = 15, add to running total (19)
        //  4 + 15 = 19
        Assert.assertEquals( 15, adder.add( 7, 8 ));
        Assert.assertEquals( "Running total should be 19",19, adder.getValue() );
    }
}


