package Coding;

public class Pallindrome {
    public static void main (String[] args){
        String word = "malayalam";
        System.out.println(isPalindrome(word));
    }
    public static String isPalindrome(String word){
        char[] totChar = word.toCharArray();
        int left = 0;
        int right = totChar.length-1;
        if(totChar[left] != totChar[right]){
            return new String("It's not a palindrome");
        }
        left++;
        right--;
        return new String("It is a pallindrome");
    }
}
