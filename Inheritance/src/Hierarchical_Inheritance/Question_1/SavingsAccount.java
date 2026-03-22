package Hierarchical_Inheritance.Question_1;

public class SavingsAccount extends BankAccount{

    double interestRate = 8;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    public void displayAccountType(){
        System.out.println("Account type : Saving Account");
    }
    public void displaySavingDetail(){
        displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
