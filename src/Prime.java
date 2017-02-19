/**
 * Created by athipatl on 2/19/17.
 */
public class Prime {
    boolean primeTest(int num){
        for(int i = 2;i<=Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}
