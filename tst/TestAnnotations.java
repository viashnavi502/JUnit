import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by athipatl on 2/19/17.
 */
public class TestAnnotations {
    @Before
    public void before(){
        System.out.println("Before method");
    }

    @Test
    public void test1(){
        System.out.println("Test1 Method");
    }

    @Test
    public void test2(){
        System.out.println("Test2 method");
    }

    @After
    public void after(){
        System.out.println("After method");
    }

}
