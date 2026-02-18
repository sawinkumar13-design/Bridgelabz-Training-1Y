package com.gla.Arrays;

import java.util.Scanner;

public class calculator {
    public static double add(double num1, double num2){
        return num1+num2;
    }
    public static double sub(double num1, double num2){
        return num1-num2;
    }
    public static double mul(double num1, double num2){
        return num1*num2;
    }
    public static double div(double num1, double num2){
        return num2 / num1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
       do{
            System.out.println("1. addition");
            System.out.println("2. subtraction");
            System.out.println("3. multiplication");
            System.out.println("4. division");
            System.out.println("enter your choice");

            choice = sc.nextInt();

        if(choice>=1 && choice<=4) {
            System.out.println("enter first number : ");
            double a = sc.nextInt();
            System.out.println("enter second number :");
            double b = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result = " + add(a, b));
                    break;

                case 2:
                    System.out.println("result = " + sub(a, b));
                    break;

                case 3:
                    System.out.println("result = " + mul(a, b));
                    break;

                case 4:
                    System.out.println("result = " + div(a, b));
                    break;
            }
        }
          else{
                System.out.println("Invalid choice! Please try again.");
        }
       }while (true);

    }
}
