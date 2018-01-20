package Moderate.Q24;

/**
 * Created by Nicolas on 20/1/2018.
 */
public class Pair {
    public int a;
    public int b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair pair = (Pair) o;

        if (a != pair.a) return false;
        return b == pair.b;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        return result;
    }
}
