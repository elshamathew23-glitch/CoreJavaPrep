package Coding;

import java.util.Arrays;
import java.util.Optional;

import java.util.Comparator;
import java.util.List;

public class SecondLargestSalary {
    public static void main(String[] args) {

        //JAVA 8
        List<Integer> salary = Arrays.asList(1000, 5000, 4999, 3000, 3000, 1500);
        Optional<Integer> res = salary.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();

        res.ifPresent(r -> System.out.println(r));

        //JAVA
        int max = salary.get(0);
        int secondMax = salary.get(0);
        for(int sal : salary) {
            if (sal > max ) {
                secondMax = max;
                max = sal;
            }
            else if(sal > secondMax && sal < max){
                secondMax = sal;
            }
        }
        System.out.println("Second Highest Salary : " + secondMax);


    }
}
