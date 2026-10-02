package Coding.Numbers;

import java.util.Scanner;

public class SumOfNaturalNumWithExponents {
    public static void main(String[] args) {
        // 1+ 2(n-1)+3 (n-2)...+n(n-5) =
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        int sum =1;
        for(int i =2;i <= n;i++){
            int exponent = n-i+1;
            int term = 1;
            for(int j= 1;j <= exponent;j++){
                term =term*i;
            }
            sum= sum + term;
        }
        System.out.println("Sum is "+ sum);
    }
}
