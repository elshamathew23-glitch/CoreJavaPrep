package Coding.Strings;



public class FormatString {
    //From aabbccc -- > a2b2c3
    public static void main(String[] args) {
        String input = "aabbbcccc";
        if (input == null || input.isBlank()) {
            System.out.println("Invalid");
        }
        StringBuilder result = new StringBuilder();
        int count =1;
        for(int i =1; i< input.length();i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                result.append(input.charAt(i));
                count++;
            } else {
                result.append(count);
                count = 1;
            }
        }
            result.append(input.charAt(input.length()-1)).append(count).toString();
            System.out.println(result);
        }
      //OUTPUT : a2b3c4


}
