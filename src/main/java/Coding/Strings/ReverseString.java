package Coding.Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main (String[] args) {
        String str = "The code quality is important";
        String rev = Arrays.stream(str.split(" ")).reduce((w1,w2) -> w2 + " " + w1).orElse("");
        System.out.println(rev);
        // USING StringBuilder
       // String rev2 = Arrays.stream(str1.split(" ")).map((w) -> new StringBuilder(w).reverse()).toString();
       //System.out.println("Reverse string using StringBuilder : " + rev2);

        List<String> word = Arrays.stream(str.split(" ")).collect(Collectors.toList());
        Collections.reverse(word);
        String result = String.join(" " ,word);
        System.out.println(result);
    }
}
