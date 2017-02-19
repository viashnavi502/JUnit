import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by athipatl on 2/19/17.
 */
public class UsingAssertion {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("before Class method");
    }

    @Before
    public void before(){
        System.out.println("Before method");
    }

    @Ignore
    @Test
    public void assertionTests(){
        System.out.println("Assertion test method");
        String str1 = "string";
        String str2 = "string";

        Assert.assertTrue(true);
        Assert.assertFalse(false);
        Assert.assertNull(null);
        Assert.assertNotNull("abc");
        Assert.assertEquals(str1,str2);
        Assert.assertSame(str1,str2);
    }

    @Test
    public void test1(){
        System.out.println("test1 method");
    }


    @Test
    public void test2(){
        System.out.println("test2 method");
    }

    @After
    public void after(){
        System.out.println("After method");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After class method");
    }

}
