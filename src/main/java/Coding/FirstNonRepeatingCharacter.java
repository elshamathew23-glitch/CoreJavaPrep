package Coding;

import java.util.*;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String word = "bookkeeper";
        Map<Character,Long> res = word.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(c->c,() -> new LinkedHashMap<>(),Collectors.counting()));
   for(Map.Entry<Character,Long> entry : res.entrySet()){
       if(entry.getValue()==1){
           System.out.println("First Non Repeating character :  " + entry.getKey());
           break;
       }
   }
    }

}
