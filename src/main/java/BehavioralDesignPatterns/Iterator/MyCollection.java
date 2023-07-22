package BehavioralDesignPatterns.Iterator;

class MyCollection<T> implements MyIterable<T> {
    private T[] elements;

    public MyCollection(T[] elements) {
        this.elements = elements;
    }

    public MyIterator<T> iterator() {
        return new MyCollectionIterator<>(elements);
    }
}
