import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by kevin on 7/30/2017.
 */
public class BasicsTest
{
    private static Logger log = LogManager.getLogger();

    // legacy declaration of a test
    // public voic test<SomeMeaningfulName>()
    @Test
    @Ignore
    public void testExample()
    {
        log.trace( "testExample()" );
    }

}
