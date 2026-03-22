package Hierarchical_Inheritance.Question_1;
public class CheckingAccount extends BankAccount{

    double withdrawalLimit = 100000;

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    public void displayAccountType(){
        System.out.println("Account Type: Checking Account");
    }
    public void displayCheckingDetails() {
        displayDetails();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}
