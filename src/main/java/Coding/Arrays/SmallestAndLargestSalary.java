package Coding.Arrays;

import java.util.*;

public class SmallestAndLargestSalary {
    public static void main(String[] args){
        //nonPrimitive
        List<Integer> salary = Arrays.asList(1000,2000,3000,4000,5000);
        Optional<Integer> highest = salary.stream().distinct().sorted(Comparator.reverseOrder()).findFirst();
        highest.ifPresent(h-> System.out.println("Highest Salary : " + h));

        Optional<Integer> smallest =salary.stream().distinct().sorted().findFirst();
        smallest.ifPresent(s-> System.out.println("Smallest salary is : "+s));


        //primitive
        int arr[] ={1000,2000,3000,4000,5000};
        OptionalInt res = Arrays.stream(arr).distinct().sorted().findFirst();
        res.ifPresent(n->System.out.println("Smallest Salary is : "+n));

        Optional<Integer> result =Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()).findFirst();
        result.ifPresent(v -> System.out.println("Highest Salary is : "+v));


    }
}
