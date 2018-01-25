package Hard;

/**
 * Created by Nicolas on 25/1/2018.
 */
public class Q10 {

    public static int findMajorityElement(int[] array) {

        // Search for candidate for majority
        int majorityCandidate = selectCandidate(array);

        /*No candidate was found */
        if (majorityCandidate == -1)
            return -1;

        /*
        * Validate that the candidate is actually the majority of all array, a candidate can be a majority of a subarray
        * but not all the array
        * */
        if (checkMajority(majorityCandidate, array))
            return majorityCandidate;
        return -1;
    }

    /*
    * Iterate each element and count the elements that are not the same as this (as well the ones that that are the same)
    * When countCandidateElement < countOtherElements the subarray (majorityCandidate - array[i]) has nothing to offer to the overall majority
    * so it can be "removed" select next element as candidate and do that all over again
    * */
    private static int selectCandidate(int[] array) {
        int countCandidateElement = 0;
        //Every element that is not the majorityCandidate increases this count
        int countOtherElements = 0;
        //Counts the occurrences of the the current element we are checking (majorityCandidate)
        int majorityCandidate = array[0];

        for (int i = 1; i < array.length; i++) {
            //For each majorityCandidate that we have selected to check, compare it with every other element until the subarray has no majority
            if (majorityCandidate != array[i])
                countOtherElements++;
            else
                countCandidateElement++;

            //Subarray has no majority so we can "remove it" from the search
            if (countOtherElements >= countCandidateElement) {
                countCandidateElement = 0;
                countOtherElements = 0;

                if(i == array.length -1)
                    return -1;

                majorityCandidate = array[i+1];
                i = i+1;
            }

        }

        return majorityCandidate;
    }

    /*Check that candidate is actual the majority*/
    private static boolean checkMajority(int candidate, int[] array) {
        int count = 0;
        for (int i : array) {
            if (i == candidate)
                count++;
        }

        if (count > array.length / 2)
            return true;
        return false;
    }
}
