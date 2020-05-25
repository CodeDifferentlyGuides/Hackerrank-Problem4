  
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void contructSolutionTest(){
        String input = "2
                        0 2 10
                        5 3 5";
        String expected = "2 6 14 30 62 126 254 510 1022 2046";
                           
        String actual = "*insert main function call*";

        Assert.assertEquals(expected, actual);
    }
}
