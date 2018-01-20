package Moderate;

import java.util.Random;

/**
 * ???
 */
public class Q23 {

    public static int rand7(){
        while(true){
            int num = 5 * rand5() + rand5();
            if(num<21)
                return num%7;
        }
    }

    private static int rand5(){
        Random random = new Random();
        return random.nextInt(5);
    }
}
