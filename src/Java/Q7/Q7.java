package Java.Q7;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Nicolas on 8/1/2018.
 */
public class Q7 {

    public static int countPopulation(List<Country> countries, String continent){

       Stream<Country> subList =  countries.stream().filter(
                country -> {return country.getContinent().equals(continent);}
        );

       Stream<Integer> populations = subList.map(c->c.getPopulation());

       int population = populations.reduce(0, (a, b) -> a+ b);
       return population;
    }
}
