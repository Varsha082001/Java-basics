package org.example;

public class StringPalindrome {
        public static void main(String[] args) {
            String str = "mam";
            String rev = new StringBuilder(str).reverse().toString();
            System.out.println(str.equals(rev) ? "Palindrome" : "Not a Palindrome");
        }
    }


