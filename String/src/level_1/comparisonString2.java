package com.gla.String_level_1;

import java.util.Scanner;

public class comparisonString2 {
    public static String creatSubString(String str, int start, int end){
        String ch = "";
        for(int i= start;i<end;i++){
            ch += str.charAt(i);
        }
        return ch;
    }
    public static boolean compareString(String s1 ,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first string : ");
        String str = input.next();
        System.out.println("enter start index: ");
        int start = input.nextInt();
        System.out.println("enter end index: ");
        int end = input.nextInt();

        String s1 = creatSubString(str,start,end);
        String s2 = str.substring(start,end);

        boolean result = compareString(s1, s2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(result);
    }
}
