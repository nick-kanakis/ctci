package Hard;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 28/1/2018.
 */
public class Q20Test {

    @Test
    public void testFindMedian() throws Exception {
        Q20 q20 = new Q20();

        q20.addElement(1);
        q20.addElement(2);
        assertEquals(1, q20.findMedian());
        q20.addElement(3);
        assertEquals(2, q20.findMedian());
        q20.addElement(4);
        assertEquals(2, q20.findMedian());
        q20.addElement(10);
        assertEquals(3, q20.findMedian());
        q20.addElement(15);
        assertEquals(3, q20.findMedian());
        q20.addElement(20);
        assertEquals(4, q20.findMedian());
        q20.addElement(11);
        assertEquals(7, q20.findMedian());
        q20.addElement(12);
        assertEquals(10, q20.findMedian());
        q20.addElement(0);
        assertEquals(7, q20.findMedian());


    }
}
