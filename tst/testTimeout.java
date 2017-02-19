import org.junit.Test;

/**
 * Created by athipatl on 2/19/17.
 */
public class testTimeout {
    MessageUtil msg = new MessageUtil("Hello");

    @Test(timeout = 1000)
    public void test1(){
//        msg.loop();
        msg.printMessage();
    }
}
