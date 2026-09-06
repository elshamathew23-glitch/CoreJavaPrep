package Coding;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SecondLargestSalary {
    public static void main(String[] args) {
        List<Integer> salary = Arrays.asList(1000, 5000, 4999, 3000, 3000, 1500);
        Optional<Integer> res = salary.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();

        res.ifPresent(r -> System.out.println(r));

     //java

    }
}
