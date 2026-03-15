package com.gla.String_level_1;

import java.util.Scanner;

public class returnCharacter {
    public static char[] getCharUsingCharAt(String str){
        char[] chars = new char[str.length()];
        for(int i=0;i<str.length();i++){
            chars[i] = str.charAt(i);
        }
        return chars;
    }
    public static boolean compareCharArray(char[] a, char[] b){
        if(a.length!=b.length){
            return false;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter string : ");
        String str = input.next();

        char[] ch1 = getCharUsingCharAt(str);
        char[] ch2 = str.toCharArray();

        boolean result = compareCharArray(ch1, ch2);

        System.out.println("using charAt");
        for (char c : ch1){
            System.out.println(c+"");
        }
        System.out.println("using builtIn method");
        for (char c: ch2){
            System.out.println(c+"");
        }
        System.out.println(result);
    }
}
