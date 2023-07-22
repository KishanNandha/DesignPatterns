package BehavioralDesignPatterns.Iterator;

import java.util.NoSuchElementException;

class MyCollectionIterator<T> implements MyIterator<T> {
    private T[] elements;
    private int current;

    public MyCollectionIterator(T[] elements) {
        this.elements = elements;
        this.current = 0;
    }

    public boolean hasNext() {
        return current < elements.length;
    }

    public T next() {
        if (hasNext()) {
            return elements[current++];
        }
        throw new NoSuchElementException("No more elements in the collection.");
    }
}
