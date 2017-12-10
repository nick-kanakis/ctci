package Math_Logic_Puzzles;

import java.util.Random;

/**
 * Create a simulation for a max number of families and count how many girls/boys exist.
 *
 * The result should be ~.5 since the general biology has not change and we have only added an extra rule.
 */
public class Q7 {

    private static class Family{
        int boys = 0;
        int girls = 0;
    }

    public static double postApocalypticGenderRatio(int maxNumOfFamilies){

        int boys = 0;
        int girls = 0;
        for (int i = 0; i < maxNumOfFamilies; i++) {
            Family family = runFamily();
            boys+=family.boys;
            girls+=family.girls;
        }

        return girls/ (double) (boys+girls);
    }

    private static Family runFamily() {
        Family family = new Family();
        Random random = new Random();
        boolean isItGirl;

        while(family.girls == 0){
            isItGirl = random.nextBoolean();
            if(isItGirl){
                family.girls+=1;
            } else{
                family.boys+=1;
            }
        }

        return family;
    }
}
