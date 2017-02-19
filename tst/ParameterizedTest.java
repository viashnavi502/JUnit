import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by athipatl on 2/19/17.
 */

@RunWith(Parameterized.class)
public class ParameterizedTest {

    int value;
    boolean result;
    Prime p ;

    @Before
    public void before(){
        p = new Prime();
    }

    public ParameterizedTest(int value,boolean result){
        this.value = value;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection listOfVlaues(){
        return Arrays.asList(
                new Object[][]{
                        {2,true},
                        {3,true}
                }
        );
    }

    @Test
    public void test1(){
        Assert.assertEquals(p.primeTest(value),result);
        System.out.println("Success");
    }

}
