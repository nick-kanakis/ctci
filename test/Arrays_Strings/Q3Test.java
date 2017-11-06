package Arrays_Strings;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Nicolas on 6/11/2017.
 */
public class Q3Test {

    @Test
    public void testURLify(){
      String result =  Q3.URLify("Mr John Smith    ", 13);
     assertTrue("Mr%20John%20Smith".equals(result));
    }

}
