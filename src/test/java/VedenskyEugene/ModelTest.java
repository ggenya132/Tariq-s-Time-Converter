
package VedenskyEugene;

/**
 * Created by eugenevendensky on 2/14/17.`
 */
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class ModelTest {
    Model model;

    @Before
    public void setUp(){model = new Model();}

    @Test
    public void splitTimeInputStringByColonTest(){

        String[] actual = model.splitTimeInputStringByColon("5:05");
        String[] expected = {"5", "05"};
        assertEquals(Arrays.toString(actual), Arrays.toString(expected));

    }
    @Test
    public void buildTimeIntoStringTest() throws InvalidTimeException {
        String[] testStringArray = model.splitTimeInputStringByColon("5:02");
        String actual = model.buildTimeIntoString(testStringArray);
        String expected = "five o' two";
        assertEquals(actual, expected);
    }
    @Test
    public void buildTimeIntoStringMillitary() throws InvalidTimeException {
        String[] testStringArray = model.splitTimeInputStringByColon("14:52");
        String actual = model.buildTimeIntoStringMilitary(testStringArray);
        String expected = "five o' two";
        assertEquals(actual, expected);
    }

}
