package kim.andy;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by andykim on 1/13/17.
 */
public class lab2Test {

    greetingLab test2;
    @Before
    public void setUp() {test2 = new greetingLab();}

    @Test
    public void sayAliceOrBob(){

        String expected = "Bob";
        String actual = test2.sayAliceOrBob("Bob");
        assertEquals(expected, actual);

    }

}
