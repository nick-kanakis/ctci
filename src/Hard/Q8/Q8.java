package Hard.Q8;

import java.util.*;

/**
 * Created by Nicolas on 23/1/2018.
 */
public class Q8 {

    public static ArrayList<Person> sort(ArrayList<Person> crew) {

        //Sort crew by height
        Collections.sort(crew, new HeightComparator());

        return findBestSequenceAtIndex(crew, new ArrayList<Person>(), 0);

    }

    private static ArrayList<Person> findBestSequenceAtIndex(ArrayList<Person> crew, ArrayList<Person> sequence, int index) {
        if(index>=crew.size())
            return sequence;

        //Get next crewMember
        Person value = crew.get(index);
        ArrayList<Person> bestWith = new ArrayList<>();

        /*
        * If crew member can be appended to solution add it and create a branch of the tree
        * with the sequence that has the new member
        * */
        if(canAppend(sequence, value)){
            ArrayList<Person> sequenceWith = (ArrayList<Person>) sequence.clone();
            sequenceWith.add(value);
            bestWith = findBestSequenceAtIndex(crew, sequenceWith, index+1);
        }

        /*
        * This time we chose not to include the current member, we return the max of the 2 sub-sequences
        * */
        ArrayList<Person> sequenceWithout = findBestSequenceAtIndex(crew, sequence, index+1);
        return max(bestWith,sequenceWithout);
    }

    private static ArrayList<Person> max(ArrayList<Person> crew1, ArrayList<Person> crew2){
        return crew1.size()> crew2.size()? crew1 : crew2;
    }

    private static boolean canAppend(ArrayList<Person> sequence, Person newPeople){
        if(sequence.size()==0)
            return true;
        Person lastPerson = sequence.get(sequence.size() - 1);

        return lastPerson.isBefore(newPeople);
    }
}
