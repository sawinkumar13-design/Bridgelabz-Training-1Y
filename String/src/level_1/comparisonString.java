package com.gla.String_level_1;

import java.util.Scanner;

public class comparisonString {
    public static boolean compareString(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first string : ");
        String s1 = input.next();
        System.out.println("enter second string : ");
        String s2 = input.next();

        boolean result1 = compareString(s1, s2);
        boolean result2 = s1.equals(s2);

        System.out.println(result1);
        System.out.println(result2);

        if (result1 == result2) {
            System.out.println("both result are same");
        }
    }
}
