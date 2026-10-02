package Coding.Numbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GetNumbersStartsWith1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,1,9,68,55,17,14,20,0);
        list.stream().filter(v-> String.valueOf(v).startsWith("1")).forEach(System.out::println);

        //EXAMPLE FOR FLATMAP
        List<List<Integer>> roundScores = List.of(
                List.of(5, 12, 3),
                List.of(8, 3, 15, 12),
                List.of(1, 9, 5)
        );
        List<Integer> result = roundScores.stream().flatMap(n ->n.stream())
                                          .filter(n -> n > 4)
                                          .sorted(Comparator.reverseOrder())
                                          .distinct()
                                          .limit(3)
                                          .toList();
        System.out.println(result);
    }
}
