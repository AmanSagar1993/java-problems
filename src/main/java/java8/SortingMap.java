package src.main.java.java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortingMap {

    public static void main(String[] args) {
        Map<String,Integer> mapp = new HashMap<>();
        mapp.put("a",1);
        mapp.put("c",2);
        mapp.put("b",3);

        //mapp.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        //mapp.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        System.out.println(mapp.entrySet().stream().max(Map.Entry.comparingByKey()).get());
    }

}
