package Recursion_DynamicProgramming;

/**
 * SOS:
 *  Giving a nickel (5cents) and then 5x1 Cent == Giving 5x1 Cent and then giving a nickel (5cents)
 *  So recursive approaches that use the current sum of coins and add  1 ,5, 10, 25 wil NOT work
 *
 *
 *
 */
public class Q11 {

    //TODO: To be continued

    public static int countPossibleCoinRepresentations(int targetCoins) {
        return countPossibleCoinRepresentationsHelper(0, targetCoins);
    }

    private static int countPossibleCoinRepresentationsHelper(int currentCoins, int targetCoins) {
        return 0;
    }
}
