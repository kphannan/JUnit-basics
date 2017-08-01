package junit.examples;

/**
 * Created by kevin on 7/31/2017.
 */
public class Adder
{
    private int value;

    public Adder()
    {
        value = 0;
    }

    public int add( int v1, int v2 )
    {
        int v = v1 + v2;
        value += v;
        return v;
    }

    public int getValue()
    {
        return value;
    }


    public void reset()
    {
        value = 0;
    }
}
