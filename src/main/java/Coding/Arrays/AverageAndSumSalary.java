package Coding.Arrays;

import java.util.Arrays;
import java.util.List;

public class AverageAndSumSalary {
    public static void main(String[] args){
        List<Integer> salary = Arrays.asList(1000,2000,2500,3000,4000,5555);
        double avg = salary.stream().mapToInt(n -> n.intValue()).average().orElse(0.0);
        int sum = salary.stream().mapToInt(n->n.intValue()).sum();
        System.out.println("Average : "+avg +"\n" + "SUM : " + sum);

    }
}
