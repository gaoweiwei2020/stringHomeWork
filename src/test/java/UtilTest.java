import org.testng.Assert;
import org.testng.annotations.Test;

public class UtilTest {
    @Test
    public void trimAllTest() {


        Assert.assertEquals(util.trimAll("hello ") , "hello");
        Assert.assertEquals(util.trimAll("hello  ") , "hello");
        Assert.assertEquals(util.trimAll(" hello") , "hello");
        Assert.assertEquals(util.trimAll("hello    ") , "hello");
        Assert.assertEquals(util.trimAll("  he  llo  ") , "hello");


    }

    @Test
    public void reverseStringTest() {
        System.out.println(util.reverseString("12345  "));
        Assert.assertEquals(util.reverseString("12345  ") , "  54321");
    }


}
