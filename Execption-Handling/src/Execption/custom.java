package Execption;

class InvalidAgeCheckerExecption extends Exception{
    public InvalidAgeCheckerExecption(String msg){
        super(msg);
    }
}
public class custom {
    static void ageChecker(int age) throws InvalidAgeCheckerExecption {
        if (age < 18) {
            throw new InvalidAgeCheckerExecption("invalid age for voting");
        }
        System.out.println("valid age for voting");
    }

    public static void main(String[] args) {
        try {
            ageChecker(19);
        }
        catch (InvalidAgeCheckerExecption e){
            System.out.println(e.getMessage());
        }
    }
}

