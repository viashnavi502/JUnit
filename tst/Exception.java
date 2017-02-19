import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import org.junit.Test;

/**
 * Created by athipatl on 2/19/17.
 */
public class Exception {

    @Test(expected = ArithmeticException.class)
    public void test1(){
        int a = 1/0;
        System.out.println(a);
    }

}
