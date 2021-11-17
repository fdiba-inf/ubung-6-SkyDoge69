package exercise6;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int temp = n;
        boolean is_palindrome = true;
//        ArrayList<Integer> array = new ArrayList<Integer>();
        while (n!=0) {
            int a = n % 10;
            sum = (sum*10) + a;
            n = n / 10;
        }

        if (temp != sum) {
            is_palindrome = false;
        }

        System.out.println("Palindrome: " + is_palindrome);
    }
}
