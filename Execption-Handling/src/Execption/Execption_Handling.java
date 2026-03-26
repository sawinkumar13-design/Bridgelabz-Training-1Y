package Execption;

public class Execption_Handling {
    public static void arthmeticExecption(){
      try {
          int a=4;
          int b=0;
          double result = a/b;
          System.out.println(result);
          String c1 = null;
          System.out.println(c1.length());
      }
      catch (ArithmeticException e){
          System.out.println(e.getMessage());
      }
      catch (NullPointerException e){
          System.out.println(e.getMessage());
      }
    }
    public static void nullPointerExecption(){
        try {
            String s1 = null;
            String s2 = null;
            System.out.println(s1.equals(s2));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void ageChecker(int age) {
        if (age < 18)
            throw new ArithmeticException("invalid age");
        System.out.println("valid age");
    }
    public static void main(String[] args) {
        arthmeticExecption();
        nullPointerExecption();
        ageChecker(17);
    }
}
