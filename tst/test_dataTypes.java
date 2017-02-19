import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by athipatl on 2/19/17.
 */
public class test_dataTypes {
    @Test
    public void testDifferentTypes(){
        int i = 5;
        String str = "Hello World";

        Assert.assertEquals(str,"Hello World");
        Assert.assertEquals(i,5);
    }

}
