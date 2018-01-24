package Hard.Q8;

import java.util.Comparator;

/**
 * Created by Nicolas on 23/1/2018.
 */
public class HeightComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if(p1.height>= p2.height)
            return 1;
        else
            return  -1;
    }
}
