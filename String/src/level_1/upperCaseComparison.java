package com.gla.String_level_1;

import java.util.Scanner;

public class upperCaseComparison {
    public static String usingCharAt(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                ch = (char)(ch-32);
            }
            result+=ch;
        }
        return result;
    }
    public static boolean comparison(String s1,String s2){
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
        System.out.println("enter string");
        String str = input.nextLine();

        String a = usingCharAt(str);
        String b = str.toUpperCase();

        boolean result = comparison(a,b);

        System.out.println("using charat : "+a);
        System.out.println("using builtin function : "+b);
        System.out.println("comparison : "+result);

    }
}
