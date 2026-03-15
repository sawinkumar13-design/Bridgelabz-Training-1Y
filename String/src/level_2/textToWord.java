package com.gla.string_level_2;

public class textToWord {
     public static int len(String str){
         int count =0;
         for(char ch :str.toCharArray()){
             count++;
         }
         return count;
     }
     public static String[] splitText(String str){
        int len = len(str);
        int word = 0;
        boolean inWord = false;

        for(int i=0;i<len;i++){
            char ch = str.charAt(i);
            if(ch!="" && !inWord){
                word++;
                inWord = true;
            }
            else if (ch==""){
                inWord = false;
            }
        }
        int[]
     }
}
