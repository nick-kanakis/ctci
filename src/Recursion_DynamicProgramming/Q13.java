package Recursion_DynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * First sort the boxes in any dimension.
 * Then try each valid combination.
 */
public class Q13 {

    static class Box {
        int height = 0;
        int depth = 0;
        int width = 0;

        public Box(int height, int depth, int width) {
            this.height = height;
            this.depth = depth;
            this.width = width;
        }
    }

    public static int computeMaxHeightOfBoxes(ArrayList<Box> boxes) {
       /*
       * First it helps if we sort the boxes (by any dimension), this will create a sorted list and since
       * the next box must be smaller in ALL dimensions if it is bigger in one we can skip it and never have to
       * revisited again
       * */
        Collections.sort(boxes, new BoxComparator());

        int maxHeight = 0;
        for (int i = 0; i < boxes.size(); i++) {
            /*
            * The boxes are sorted so we only need the index of the current bottom box as a reference
            * of the current box. Here we start a recursive tree with ALL possible boxes placed in the bottom
            * */
            int height = maxHeightRecursively(boxes, i);
            maxHeight = Math.max(height, maxHeight);
        }
        return maxHeight;
    }

    private static int maxHeightRecursively(ArrayList<Box> boxes, int bottomIndex) {
        Box bottomBox = boxes.get(bottomIndex);
        int maxHeight = 0;
        for (int i = bottomIndex + 1; i < boxes.size(); i++) {
            /*If the box is not valid to be placed here we skip it and never try it again in this recursive branch*/
            if (isBoxBigger(bottomBox, boxes.get(i))) {
                int height = maxHeightRecursively(boxes, i);
                maxHeight = Math.max(height, maxHeight);
            }
        }
        /*
        * Return the maxHeight of previous calls + the current height.
        * */
        maxHeight+=bottomBox.height;
        return maxHeight;
    }

    public static int computeMaxHeightOfBoxesMemoization(ArrayList<Box> boxes) {
        Collections.sort(boxes, new BoxComparator());
        int maxHeight = 0;
        int[] cache = new int[boxes.size()];
        /*
        * The same as previous but now I use cache to store previous computed subtrees and not recompute them.
        * */
        for (int i = 0; i < boxes.size(); i++) {
            int height = maxHeightRecursively(boxes, i, cache);
            maxHeight = Math.max(height, maxHeight);
        }
        return maxHeight;
    }

    private static int maxHeightRecursively(ArrayList<Box> boxes, int bottomIndex, int[] cache) {
        /*If the cache[bottomIndex] is not 0 this subtree has already been calculated in the past.
        * There is no need to recalculate the max height for this subtree*/
        if(bottomIndex<boxes.size() && cache[bottomIndex]>0)
            return cache[bottomIndex];

        Box bottomBox = boxes.get(bottomIndex);
        int maxHeight = 0;
        for (int i = bottomIndex + 1; i < boxes.size(); i++) {
            if (isBoxBigger(bottomBox, boxes.get(i))) {
                int height = maxHeightRecursively(boxes, i);
                maxHeight = Math.max(height, maxHeight);
            }
        }
        maxHeight+=bottomBox.height;
        /*
        * Save the height of this box.
        * */
        cache[bottomIndex]= maxHeight;
        return maxHeight;
    }

    private static boolean isBoxBigger(Box newBox, Box currentTopBox) {
        if (currentTopBox.depth > newBox.depth)
            return false;
        if (currentTopBox.width > newBox.width)
            return false;
        if (currentTopBox.height > newBox.height)
            return false;

        return true;
    }

    private static class BoxComparator implements Comparator<Box> {
        @Override
        public int compare(Box box1, Box box2) {
            return box2.height - box1.height;
        }
    }
}
