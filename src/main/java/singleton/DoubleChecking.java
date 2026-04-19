package src.main.java.singleton;

public class DoubleChecking {

    private static volatile DoubleChecking doubleCheckingInstance;

    private DoubleChecking(){

    }

    public static DoubleChecking getInstance(){

        if(null == doubleCheckingInstance){

            synchronized(DoubleChecking.class){
                if(null == doubleCheckingInstance)
                    doubleCheckingInstance = new DoubleChecking();
            }
        }
        return doubleCheckingInstance;
    }

}
