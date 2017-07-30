import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * Created by kevin on 7/28/2017.
 */
public class Retry implements TestRule {

    private static Logger log = LogManager.getLogger();

    private int retryCount;

    public Retry( int numRetries )
    {
        retryCount = numRetries;
    }

    @Override
    public Statement apply(Statement base, Description description) {
        return statement( base, description );
    }

    private Statement statement(final Statement base, final Description description )
    {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                Throwable throwable = null;

                for ( int i = 0; i < retryCount; ++i )
                {
                    try
                    {
                        base.evaluate();
                        return;
                    }
                    catch ( Throwable e )
                    {
                        throwable = e;
                    }
                }

                log.warn( "Giving up after " + retryCount + " failures" );
                log.warn( throwable );
                throw throwable;
            }
        };
    }
}
