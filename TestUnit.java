import org.junit.*;
import org.junit.Test;

import bmi_calculator.Base;

import static org.junit.Assert.*;

public class TestUnit 
{
    protected double w;
    protected double h;
    Base obj;

    @Before
    public void setUp()
    {
        w = 48.0;
        h = 165.0;
        obj = new Base.Child(w, h).build();
    }

    @After 
    public void tearDown()
    {
        obj = null;
    }

    @Test 
    /*
     * Check to see if the build() method of class Child deos return an object
     * of type Base.
     */
    public void test_the_build_method()
    {
        Base obj2 = new Base.Child(w, h).build();
        assertEquals(obj, obj2 );
    }
}