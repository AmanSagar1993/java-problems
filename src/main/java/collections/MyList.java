package src.main.java.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyList {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Bob", 4.3));
        studentList.add(new Student("Shi", 4.0));
        studentList.add(new Student("Aman", 4.3));
        studentList.add(new Student("Neelesh", 3.7));

        studentList.stream().sorted(Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName)).toList().forEach(s -> System.out.println(s.getName() + " " + s.getGpa()));

    }
}
