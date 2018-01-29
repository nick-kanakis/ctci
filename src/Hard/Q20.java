package Hard;

import java.util.ArrayList;


/**
 * Insert the elements in order as they come.( O(logn) ) the median will be the element (or the elements) in the middle.
 */
public class Q20 {

    private ArrayList<Integer> list;

    public Q20() {
        list = new ArrayList<>();
    }

    public void addElement(int value) {
        if (list.size() == 0)
            list.add(value);
        else addElement(value, 0, list.size());
    }

    private void addElement(int value, int start, int end) {
        if (Math.abs(start - end) <= 1) {
            list.add(end, value);
            return;
        }

        int mid = (start + end) / 2;
        if (value <= list.get(mid)) {
            addElement(value, start, mid);
        } else {
            addElement(value, mid, end);
        }
    }


    public int findMedian() {
        int mid = (list.size() - 1) / 2;

        if (list.size() % 2 == 0) {
            return (list.get(mid) + list.get(mid + 1)) / 2;
        } else {
            return list.get(mid);
        }
    }
}
