package CreationalDesignPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        singleton.doSomething();
    }
}
