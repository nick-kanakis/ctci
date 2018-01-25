package Hard;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 25/1/2018.
 */
public class Q10Test {

    @Test
    public void testFindMajorityElement() throws Exception {
        int[] arrayWithMajority = new int[]{1,5,5,5,5,5,7};
        assertEquals(5, Q10.findMajorityElement(arrayWithMajority));
    }

    @Test
    public void testFindMajorityWithNoMajority() throws Exception {
        int[] arrayWithNoMajority = new int[]{1,2,3,4,5,6,7,8};
        assertEquals(-1, Q10.findMajorityElement(arrayWithNoMajority));
    }

    @Test
    public void testFindMajorityWithCandidateButNotMajority() throws Exception {
        int[] arrayWithCandidateButNotMajority = new int[]{1,2,3,4,5,6,7,7,7};
        assertEquals(-1, Q10.findMajorityElement(arrayWithCandidateButNotMajority));
    }
}
