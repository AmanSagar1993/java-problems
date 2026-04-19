package src.main.java.singleton;

public class MyMain {

    public static void main(String[] args) {
//        LazyLoadingSingleton lazyLoadingSingleton = LazyLoadingSingleton.getInstance();
//        System.out.println(lazyLoadingSingleton);

//        SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getInstance();
//        System.out.println(synchronizedSingleton);

        DoubleChecking d1 = DoubleChecking.getInstance();
        DoubleChecking d2 = DoubleChecking.getInstance();
        DoubleChecking d34 = DoubleChecking.getInstance();
        DoubleChecking d4 = DoubleChecking.getInstance();DoubleChecking d5 = DoubleChecking.getInstance();
        DoubleChecking d6 = DoubleChecking.getInstance();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d34);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
    }
    }

