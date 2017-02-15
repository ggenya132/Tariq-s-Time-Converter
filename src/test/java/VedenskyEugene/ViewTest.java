package VedenskyEugene;


import org.junit.Before;

/**
 * Created by eugenevendensky on 2/14/17.
 */

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class ViewTest {

    View view;
    @Before
    public void setUp(){view = new View();}
    @Test
    public void askUserTimeTest(){


        String actual = view.askUserTime();
        String expected = " ";
        assertEquals(actual,expected);
    }

}
