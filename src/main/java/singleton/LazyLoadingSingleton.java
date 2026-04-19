package src.main.java.singleton;

public class LazyLoadingSingleton {

    private static LazyLoadingSingleton lazyLoadingSingleton;

    private LazyLoadingSingleton(){

    }

    public static LazyLoadingSingleton getInstance(){  // not thread safe, if two threads come together, it fails

        if(lazyLoadingSingleton == null){
            lazyLoadingSingleton = new LazyLoadingSingleton();
        }
        return lazyLoadingSingleton;
    }
}
