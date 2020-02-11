package org.example.palindrome;

import java.util.Scanner;

public class ShortestPalindrome {
    public static void main(String[] args) {
        System.out.println("Finding the shortest palindrome :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String output = find(sc.next());
        System.out.println("Shortest palindrome : " + output);
    }

    public static String find(String s) {
        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while (rightPointer >= 0) {
            if (s.charAt(leftPointer) == s.charAt(rightPointer)) {
                leftPointer++;
            }
            rightPointer--;
        }

        if (leftPointer == s.length())
            return s;

        String suffix = s.substring(leftPointer);
        String prefix = new StringBuilder(suffix).reverse().toString();
        String mid = find(s.substring(0, leftPointer));
        return prefix + mid + suffix;
    }
}
