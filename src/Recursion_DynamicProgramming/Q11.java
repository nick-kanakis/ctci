package Recursion_DynamicProgramming;

/**
 * SOS:
 *  Giving a nickel (5cents) and then 5x1 Cent == Giving 5x1 Cent and then giving a nickel (5cents)
 *  So recursive approaches that use the current sum of coins and add  1 ,5, 10, 25 wil NOT work
 *
 */
public class Q11 {

    public static int countPossibleCoinRepresentations(int amount) {
        int[] coinAmounts = new int[]{25,10,5,1};
        return countPossibleCoinRepresentationsHelper(amount, coinAmounts, 0);
    }

    private static int countPossibleCoinRepresentationsHelper(int amount, int[] coinAmounts, int index ) {
        if(index>=coinAmounts.length -1)
            return 1;
        int currentWays = 0;
        int coinAmount = coinAmounts[index];
        for (int i = 0; i* coinAmount<= amount; i++) {
            int amountRemaining = amount - (i * coinAmount);
            currentWays += countPossibleCoinRepresentationsHelper(amountRemaining, coinAmounts, index+1);
        }
        return currentWays;
    }
}
