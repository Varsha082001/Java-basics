package org.example;

public class NumberPalindrome {
    public static void main(String[] args) {
        int num = 22, original = num, rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println(original == rev ? "Palindrome" : "Not a Palindrome");
    }
}


