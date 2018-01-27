package Hard.Q15;

import java.util.Comparator;

/**
 * Created by Nicolas on 27/1/2018.
 */
public class LengthComparator implements Comparator<String> {
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}

