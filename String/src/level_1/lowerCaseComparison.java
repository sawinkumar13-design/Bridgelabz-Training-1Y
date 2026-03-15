package com.gla.String_level_1;

import java.util.Scanner;

public class lowerCaseComparison {
    public static String usingCharAt(String str){
        String result ="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch = (char)(ch+32);
            }
            result+=ch;
        }
        return result;
    }
    public static boolean comparison(String a, String b){
        if(a.length()!=b.length()){
            return false;
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter string");
        String str = input.next();

        String s1 = usingCharAt(str);
        String s2 = str.toLowerCase();

        boolean result = comparison(s1,s2);

        System.out.println("using charAt :"+s1);
        System.out.println("using builtIn method : "+s2);
        System.out.println("comparison : "+result);
    }
}
