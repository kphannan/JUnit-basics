import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.Collection;

/**
 * Created by kevin on 7/28/2017.
 */

@RunWith(Parameterized.class)
public class TestSuite_3 {


    private static Logger log = LogManager.getLogger();

    @Parameterized.Parameter
    public JSONObject  json;

    @Parameterized.Parameters
    public static Collection data() throws IOException, ParseException
    {
        return Helper.data();
    }

    @Test
    public void test()
    {
        log.info( "--- Test name: " + json.get( "test_name"));
        log.info( "     Username: " + json.get( "username"));
        log.info( "     Password: " + json.get( "password"));
    }
}
