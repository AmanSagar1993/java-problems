package src.main.java.singleton;

public class MainClass {

    public static void main(String args[]){

//        EagerLoadingSingleton eagerLoadingSingleton = EagerLoadingSingleton.getInstance();
//        System.out.print(eagerLoadingSingleton);

        LazyLoadingSingleton lazyLoadingSingleton = LazyLoadingSingleton.getInstance();
        System.out.println(lazyLoadingSingleton);
    }
}
