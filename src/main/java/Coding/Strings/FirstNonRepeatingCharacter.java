package Coding.Strings;

import java.util.*;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String word = "bookkeeper";
        // JAVA 8
        Map<Character, Long> res = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, () -> new LinkedHashMap<>(), Collectors.counting()));
        for (Map.Entry<Character, Long> entry : res.entrySet()) {
            if (entry.getValue() == 1) {
               System.out.println("First Non Repeating character is :  " + entry.getKey());
                break;
            }
        }
   // Normal JAVA

        Map<Character, Integer> charGroup = new LinkedHashMap<>();
        for (Character ch : word.toCharArray()) {
            if (charGroup.containsKey(ch)) {
                charGroup.put(ch, charGroup.get(ch) + 1);
            } else {
                charGroup.put(ch, 1);
            }
        }
        System.out.println(" Character with maximum frequency : \n  ");
        for (Map.Entry<Character, Integer> entry : charGroup.entrySet()) {

            if (entry.getValue() == 1) {
                System.out.println("First Non Repeating character is :  " + entry.getKey());
                break;
            }}


        //Character with maximum frequency from the word

        System.out.println(" Character with maximum frequency : \n  ");
        for (Map.Entry<Character, Integer> entry : charGroup.entrySet()) {
            System.out.println(entry.getKey() + ":"+ entry.getValue());
        }
        }


    }
