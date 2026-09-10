package Coding.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {
    public static void main(String[] args) {
        List<Integer> salary = Arrays.asList(1000, 2000, 5000, 4000, 3000, 3000, 1500);
        List<Integer> res = new ArrayList<>(salary);
        Collections.reverse(res);
        System.out.println("Reverse : " + res);
    }
}
