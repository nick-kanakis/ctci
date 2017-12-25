package Recursion_DynamicProgramming.Q6;

/**
 * In this algorithm works by building on previous layers. The 3 main steps are:
 *
 * 1) Move n-1 disks from origin to buffer (recursively)
 * 2) Move n disk from origin to destination
 * 3) Move the n-1 disks from buffer to destination (recursively)
 */
public class Q6 {
    public static boolean moveDisks(int n){
        Tower[] towers = new Tower[3];

        //initialize towers
        for (int i = 0; i < 3; i++) {
            towers[i] = new Tower(i);
        }

        //add disks to first tower
        for (int i = n-1; i >=0 ; i--) {
            towers[0].addDisk(i);
        }

        return modeDisksHelper(towers[0], towers[1], towers[2], n);
    }

    private static boolean modeDisksHelper(Tower origin, Tower destination, Tower buffer, int n) {
        if(n>0){
            if(!modeDisksHelper(origin, buffer, destination, n -1)){
                return false;
            }
            if(!origin.moveTopTo(destination)){
                return false;
            }
            if(!modeDisksHelper(buffer, destination, origin, n-1)){
                return false;
            }
        }
        return true;
    }
}
