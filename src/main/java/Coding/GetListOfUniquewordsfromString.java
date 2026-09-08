package Coding;

import java.util.*;
import java.util.stream.Collectors;

public class GetListOfUniquewordsfromString {
    public static void main(String[] args){
        String sentence = "Java is simple and java is easy";
        Set<String> uniqueWords = Arrays.stream(sentence.toLowerCase().split("\\s+"))
                                        .collect(Collectors.toCollection(()->new TreeSet<>()));
        System.out.println("List of Unique words in alphabetic order :  "+uniqueWords);

//Count of words in a given string in Alphabetical order
        Map<String,Long> res = Arrays.stream(sentence.toLowerCase().split("\\s+"))
                                     .collect(Collectors.groupingBy(s->s,()-> new TreeMap<>(),Collectors.counting()));
        System.out.println("Count of words in a String  ");
        for(Map.Entry<String,Long> entry : res.entrySet()){
                System.out.println(entry.getKey()+ " : " + entry.getValue());

        }
    }
}
