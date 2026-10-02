package Coding.Strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args){

        String str1 = "listen";
        String str2 = "silent";
            if (str1.length() != str2.length()) {
                System.out.println("Not an anagram");
            } else {
                char[] c1 = str1.toCharArray();
                char[] c2 = str2.toCharArray();

                Arrays.sort(c1);
                Arrays.sort(c2);
                if (Arrays.equals(c1, c2)) {
                   System.out.println("Anagram");
                }

            }
            //ALTERNATE METHOD - JAVA 8
        List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        Map<String, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(word -> {
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }));
        System.out.println(grouped);

//        public static String sortChars(String word) {
//            char[] chars = word.toCharArray(); // "eat"  -> ['e', 'a', 't']
//            Arrays.sort(chars);               // ['e', 'a', 't'] -> ['a', 'e', 't']
//            return new String(chars);         // ['a', 'e', 't'] -> "aet"
//        }


        String input = "banana";
        Map<Character,Long> group = input.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(c->c,() -> new LinkedHashMap<>(),Collectors.counting()));
                System.out.println(group);

        List<String> rawNames = List.of("alice", "bob", "ALICE", "charlie", "BOB", "anna", "  ");
        List<String> result = rawNames.stream()
                                      .filter(n-> !n.isBlank())
                                      .map(m->m.toUpperCase())
                                      .filter(s->s.startsWith("A"))
                                      .distinct()
                                      .toList();
        System.out.println(result);
        // [ALICE, ALICE, ANNA]



    }
}
