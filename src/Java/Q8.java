package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by Nicolas on 8/1/2018.
 */
public class Q8 {

    public static List<Integer> getRandomSubset(List<Integer> list){
        List<Integer> result = new ArrayList<>();
        Random random = new Random();
        result = list.stream().filter(
                k->{return random.nextBoolean();}
        ).collect(Collectors.toList());

        return result;
    }
}
