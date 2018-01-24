package Hard.Q8;

import java.util.Comparator;

/**
 * Created by Nicolas on 23/1/2018.
 */
public class Person {
    public int height;
    public int weight;

    public Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public boolean isBefore(Person other){
        if(height < other.height && weight < other.weight)
            return true;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (height != person.height) return false;
        return weight == person.weight;
    }

    @Override
    public int hashCode() {
        int result = height;
        result = 31 * result + weight;
        return result;
    }
}
