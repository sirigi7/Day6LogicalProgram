package BridgeLabz;

import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer to reverse: ");
        int n = sc.nextInt();
        int reverse = 0;
        while (n != 0) {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n /= 10;
        }
        System.out.println("Reversed number: " + reverse);
        sc.close();
    }
}
