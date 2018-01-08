package Java;

import Java.Q7.Country;
import Java.Q7.Q7;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 8/1/2018.
 */
public class Q7Test {

    @Test
    public void testCountPopulation() throws Exception {
        Country greece = new Country(10000000, "Europe");
        Country italy = new Country(50000000, "Europe");
        Country usa = new Country(300000000, "North America");
        List<Country> countries = new ArrayList<>();
        countries.add(greece);
        countries.add(italy);
        countries.add(usa);

        assertEquals(60000000, Q7.countPopulation(countries, "Europe"));
        assertEquals(300000000, Q7.countPopulation(countries, "North America"));
    }
}
