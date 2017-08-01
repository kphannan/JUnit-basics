import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by kevin on 7/30/2017.
 */
public class BasicsTestAnnotation {

    private static Logger log = LogManager.getLogger();

    @Test
    public void sampleTestFunction()
    {
        log.trace( "sampleTestFunction()" );
    }

    @Test
    public void anotherTestFunction()
    {
        log.trace( "anotherTestFunction" );
    }

    @Test
    public void thirdTestFunction()
    {
        log.trace( "thirdTestFunction" );
    }

}
