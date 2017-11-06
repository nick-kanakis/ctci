package Arrays_Strings;

/**
 * Created by Nicolas on 6/11/2017.
 */
public class Q3 {

    /*
    *  You need to pointers one on the end of the actual sentence, and one on the end of the String.
    *  Copy from end to start at the end of the String (using the 2nd pointer to keep track)
    *  If character = ' ' copy %20
    *  else copy the string
    * */
    public static String URLify(String input, int actualLength){
        //TODO: check input for null
           char[] chars = input.toCharArray();
           int endPointer = chars.length -1;
           for(int i = actualLength - 1; i>= 0; i--){
               if(chars[i]!= ' '){
                   chars[endPointer] = chars[i];
                   endPointer --;
               } else {
                   chars[endPointer] = '0';
                   chars[endPointer - 1] = '2';
                   chars[endPointer - 2] = '%';
                   endPointer = endPointer -3;
               }
           }
        return new String(chars);
    }
}
