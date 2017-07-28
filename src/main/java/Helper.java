

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//import jdk.nashorn.internal.parser.JSONParser;

import java.io.FileReader;
import java.io.IOException;
//import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by kevin on 7/28/2017.
 */
public class Helper {

    public static Collection data() throws IOException, ParseException
    {
        List<Object[]> data    = new ArrayList<>();
//        JSONParser     parser  = new JSONParser();
//        Object         rawJson = parser.parse( new FileReader("foo"));
//        Object[]       keys    = rawJson.keySet().toArray();
        JSONParser     parser  = new JSONParser();
        JSONObject     rawJson = (JSONObject)parser.parse( new FileReader("src/main/resources/test.json"));
        Object[]       keys    = rawJson.keySet().toArray();
        for ( Object key : keys )
        {
            JSONObject json = (JSONObject)rawJson.get( key );
            data.add( new Object[]{ json });
        }

        return data;
    }
}
