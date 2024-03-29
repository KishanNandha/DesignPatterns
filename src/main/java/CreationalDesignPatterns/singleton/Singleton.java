package CreationalDesignPatterns.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static volatile Singleton instance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {
                if (null == instance) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
