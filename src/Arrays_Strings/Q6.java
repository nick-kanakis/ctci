package Arrays_Strings;

/**
 * Created by Nicolas on 6/11/2017.
 */
public class Q6 {

    /*
    * We iterate the string and count the occurrences of a character, in previous character is different than the one
    * we are examining append the total count, as well as the character and start counting again.
    *
    * SOS
    * Do not forget to append the last series of character!!
    *
    * */
    public static String compress(String input) {
        //TODO: check input for null

        char[] chars = input.toCharArray();
        char previous = chars[0];
        int count = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == previous) {
                count++;
            } else {
                sb.append(previous);
                sb.append(count);
                previous = chars[i];
                count = 1;
            }
        }
        //SOS the last series of characters will not be appended by the loop, you have to do it one more time
        sb.append(previous);
        sb.append(count);


        if (input.length() <= sb.length())
            return input;
        return new String(sb);
    }
}
