package Moderate;

/**
 * Created by Nicolas on 18/1/2018.
 */
public class Q18 {

    /*
    * EG: patter: aabab, value: catcatgocatgo a = cat b = go
    * */
    public static boolean patternMatching(String pattern, String value){

        //starting character (a OR b)
        char startingChar = pattern.charAt(0);
        char altChar = startingChar == 'a' ? 'b' : 'a';
        int valueSize = value.length();

        int countOfStartingChars = countOf(pattern, startingChar);
        int countOfAlterChars = pattern.length() - countOfStartingChars;
        int alternativeCharPosition = pattern.indexOf(altChar);

        /*
        * This is the max size of the starting sequence can have.
        * for the above example valueSize = 13 and countOfStartingChar =3
        * so maxStartingSize = 13/3 = 4
        */
        int maxStartingSize = valueSize/countOfStartingChars;

        for (int currentStartingSize = 0; currentStartingSize <= maxStartingSize; currentStartingSize++) {
            int remainingTotalLength = valueSize - currentStartingSize* countOfStartingChars;
            /*
            * In the first iteration will be: c,
            * in the second iteration will be: ca,
            * in the third iteration will be: cat,
            *  */
            String currentStarting = value.substring(0, currentStartingSize);

            /*
            * If the remaining size can not fit the number of alt chars then the currentStarting is wrong
            * */
            if(countOfAlterChars == 0 || remainingTotalLength%countOfAlterChars==0){
                int altIndex = alternativeCharPosition * currentStartingSize;
                int altSize = countOfAlterChars == 0 ? 0 : remainingTotalLength / countOfAlterChars;

                String currentAlternative = countOfAlterChars == 0 ? "" : value.substring(altIndex, altSize+altIndex);
                String candidate = buildFromPattern (pattern, currentStarting, currentAlternative);

                if(candidate.equals(value))
                    return true;
            }
        }
        return false;
    }

    private static String buildFromPattern(String pattern, String currentStarting, String currentAlternative) {
        StringBuilder sb = new StringBuilder();
        char first = pattern.charAt(0);
        for (char c : pattern.toCharArray()) {
            if(c == first){
                sb.append(currentStarting);
            }else {
               sb.append(currentAlternative) ;
            }
        }
        return sb.toString();
    }

    private static int countOf(String pattern, char startingChar) {
        int count = 0;
        for (int i = 0; i < pattern.length(); i++) {
            if(pattern.charAt(i) == startingChar){
                count++;
            }
        }
        return count;
    }
}
