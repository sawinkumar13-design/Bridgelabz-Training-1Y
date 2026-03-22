package Hierarchical_Inheritance.Question_1;

public class FixedDepositAccount extends BankAccount{

    int lockInPeriod = 12;

    public FixedDepositAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
    void displayFDDetails() {
        displayDetails();
        System.out.println("Lock-in Period: " + lockInPeriod + " months");
    }
}
