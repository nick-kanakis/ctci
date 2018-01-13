package Moderate;

/**
 * Created by Nicolas on 13/1/2018.
 */
public class Q1 {

    public static class Pair implements Cloneable{
        public int a;
        public int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
        
        public Pair clone(){
            return new Pair(a,b);
        }
    }
    public static Pair swapInPlace(Pair pair){
        
        Pair cloned = pair.clone();


        if(cloned.a==cloned.b)
            return cloned;
        if(cloned.a>cloned.b){
            cloned.a = cloned.a - cloned.b;
            cloned.b = cloned.b + cloned.a;
            cloned.a = cloned.b - cloned.a;
        }
        else{
            cloned.a = cloned.b - cloned.a;
            cloned.b = cloned.b - cloned.a;
            cloned.a = cloned.a + cloned.b;
        }


        return cloned;
    }
}
