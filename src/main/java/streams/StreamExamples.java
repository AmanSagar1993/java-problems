package src.main.java.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {

        //Streams from collection
        List<Integer> listt = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream mystream = listt.stream();
        mystream.forEach(System.out::println);

        //Streams from Arrays

        IntStream x = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        x.forEach(System.out::print);

        //Stream of
        Stream str = Stream.of("Aman", "is", "Awesome");
        str.forEach(System.out::print);

        //Infinite stream
        Stream st = Stream.generate(() -> 1).limit(5);
        st.forEach(System.out::println);

        List<String> names = Arrays.asList("Aman", "Shi", "Neelesh", "AmanSagar");
        names.stream().filter(s -> s.length() > 3).forEach(z -> System.out.print(z));

        List<Integer> listOfNumbers = Arrays.asList(5,3,1,7,2);
        listOfNumbers.stream().map(tt -> tt*tt).sorted().forEach(System.out::println);

        List<Integer> listOfNumber = Arrays.asList(5, 3, 1, 7, 2);
        System.out.println(listOfNumber.stream().reduce(Integer::sum).get());

        String myString = "HelloWorld";


        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"Aman");
        map.put(2,"Sagar");
        map.put(3,"XYZ");

        map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, e->e.getValue().toUpperCase())).forEach((k,v) -> System.out.println(v));



    }
}
