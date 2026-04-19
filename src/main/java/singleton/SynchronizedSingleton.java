package src.main.java.singleton;

public class SynchronizedSingleton {

    private static SynchronizedSingleton synchronizedSingleton;

    private SynchronizedSingleton(){

    }

    synchronized public static SynchronizedSingleton getInstance(){

        if(synchronizedSingleton ==  null){
            synchronizedSingleton = new SynchronizedSingleton();
        }
        return synchronizedSingleton;
    }
}
