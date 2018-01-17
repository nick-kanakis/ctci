package Moderate.Q10;

import java.util.Arrays;
import java.util.List;

/**
 * It is easy to solve it with an array (or a hashmap) for every year and count each person that is alive during that
 * period.
 * <p>
 * A better solution is to consider that you do not care who is alive when, but how many people are alive in each year.
 * So create a sorted list of births and deaths dates. Iterate both of them at the same time, they should be the same size.
 * In each iteration always choose the smallest not visited value from both arrays if it is a death if it is a birth date
 * increase the number of people alive, if it is death decrease.
 * <p>
 * In each iteration check if the last max number of people has been exited, if yes update the number of people and the current year.
 */
public class Q10 {

    public static int getMaxPeopleLiving(List<Person> people) {
        int[] births = getBirthsArray(people);
        int[] deaths = getDeathsArray(people);

        //sort arrays
        Arrays.sort(births);
        Arrays.sort(deaths);

        int birthIndex = 0;
        int deathIndex = 0;
        int currentPopulation  = 0;
        int maxPopulation  = -1;
        int maxYear = -1;
        while (birthIndex < births.length) {
            if (births[birthIndex] < deaths[deathIndex]) {
                /* the smallest date is a birth date so you need to add to the alive population and check to see
                * if the population is a new record
                * */
                currentPopulation ++;
                if(currentPopulation > maxPopulation){
                    maxPopulation = currentPopulation;
                    maxYear = births[birthIndex];
                }
                birthIndex++;
            } else{
                currentPopulation--;
                deathIndex++;
            }
        }
        return maxYear;
    }

    private static int[] getBirthsArray(List<Person> people) {
        int[] births = new int[people.size()];

        int ptr = 0;
        for (Person person : people) {
            births[ptr] = person.birth;
            ptr++;
        }

        return births;
    }

    private static int[] getDeathsArray(List<Person> people) {
        int[] deaths = new int[people.size()];

        int ptr = 0;
        for (Person person : people) {
            deaths[ptr] = person.death;
            ptr++;
        }

        return deaths;
    }

}
