package Arrays_Strings;

/**
 * Created by Nicolas on 6/11/2017.
 */
public class Q5 {

    public static boolean isEditedAtLeastOneTime(String original, String edited) {
        //TODO: check input for null
        char[] originalChars = original.toCharArray();
        char[] editedChars = edited.toCharArray();

        if (originalChars.length == editedChars.length) {
            /* In this case only `replace` can occur
             * To check that at most ONE char is replaced we:
             * Iterate at the same time both Strings if there is more than one difference return false.
             * else return true
             * */
            int diffs = 0;
            for (int i = 0; i < original.length(); i++) {
                if (originalChars[i] != editedChars[i]) {
                    diffs++;
                    if (diffs > 1)
                        return false;
                }
            }
            return true;
        } else if (originalChars.length == editedChars.length - 1) {
            /*In this one letter has been removed form original if everything else is the same we can return true.
            * We can use the same function in both edit options (remove, add) by just swapping the arguments.
            *
            * Here we assume that the original is the edited (and the edited is the original) so that we can use function
            * that check for added characters.
            */
            return oneCharAdded(editedChars, originalChars);
        } else if (originalChars.length - 1 == editedChars.length)
            //In this one letter has been added to the original if everything else is the same we can return true.
            return oneCharAdded(originalChars, editedChars);
            return false;
    }

    private static boolean oneCharAdded(char[] originalChars, char[] editedChars) {
        /* Edited will always be greater than original. So in order to return true all must be the same except from
         * one char that is added to the edited string.
         *
         * To do the check we need 2 pointers that will run throw each String. In the first difference the pointer of the
         * edited is moved by one. If there is no more diffs we return true else false.
         */
        int originalPointer = 0;
        int diffs =0;
        for (int editedPointer = 0; editedPointer < editedChars.length; editedPointer++) {
            if(editedChars[editedPointer] != originalChars[originalPointer]){
                diffs++;
                editedPointer++;
                if(diffs>1)
                    return false;
            }
            originalPointer++;
        }
        return true;
    }
}
