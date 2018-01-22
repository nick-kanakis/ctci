package Hard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Iterate the array, at each step swap the current element with an element that has already been iterated (aka every
 * element left to current position)
 */
public class Q2 {

    public static void shuffleCards(int[] cards){
        Random rand = new Random();

        for (int i = 0; i < cards.length; i++) {
            if(i == 0)
                continue;
            int position2 = rand.nextInt(i + 1);
            swap(i, position2, cards);

        }
    }

    private static void swap(int position1, int position2, int[] cards){
        if(position1==position2)
            return;
        Integer tmp = cards[position1];
        cards[position1] =  position2;
        cards[position2] = tmp;
    }
}
