package BehavioralDesignPatterns.Iterator;

public class Main {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Orange"};

        MyCollection<String> collection = new MyCollection<>(fruits);
        MyIterator<String> iterator = collection.iterator();

        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}