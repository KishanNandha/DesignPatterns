package BehavioralDesignPatterns.Iterator;

interface MyIterable<T> {
    MyIterator<T> iterator();
}