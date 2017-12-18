package OOD.Q9_CircularArray;

import java.util.Iterator;

public class CircularArray<T> implements Iterable<T>{
    private T[] items;
    private int head = 0;

    public CircularArray(int size) {
        items = (T[]) new Object[size];
    }

    /*
    * Convert is used to find the true index in the array.
    * */
    private int convert(int index){
        if(index<0){
            index += items.length;
        }
        return (head+index)% items.length;
    }

    private void rotate(int shiftRight){
        head = convert(shiftRight);
    }

    public T get(int i) {
        //check that i is between 0 - items.size
        return items[convert(i)];
    }

    public void set(int i, T item) {
        items[convert(i)] = item;
    }

    /*
    * In order to be implement Iterable interface we have to implement the iterator method which returns
    * a Iterator object.
    *
    * To return a Iterator object you need to create a private inner class that implements iterator
    * and also implement the following methods:
    *   - boolean hasNext()
    *   - Object next()
    *
    * */
    @Override
    public Iterator<T> iterator() {
        return new CircularArrayIterator();
    }

    private class CircularArrayIterator implements Iterator<T> {
        private int _current=0;
        @Override
        public boolean hasNext() {
            return _current< items.length -1;
        }

        @Override
        public T next() {
            _current++;
            return (T) items[convert(_current)];
        }
    }
}
