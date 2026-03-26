package Execption;

public class Test {
    static void ageChecker(int age) throws ArithmeticException,NullPointerException{
        if(age<18)
            throw new ArithmeticException("invalid age");
    }
    public static void main(String[] args) {
        try {
            ageChecker(10);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
