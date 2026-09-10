package Coding.Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
     //Find the duplicate characters from a String & remove

        String word = "Leetree";
        System.out.println("Duplicates in given string " + word + " : ");
        Set<Character> uniqueLetters = new LinkedHashSet<>();
                word.chars()
                    .mapToObj(c -> (char) c)
                    .filter(c -> !uniqueLetters.add(c)).forEach(System.out::println);
                System.out.println("Unique characters in a given String : "+uniqueLetters);
    }
    }
