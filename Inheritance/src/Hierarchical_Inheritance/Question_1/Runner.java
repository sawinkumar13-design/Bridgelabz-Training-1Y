package Hierarchical_Inheritance.Question_1;

public class Runner {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("2168495353",2000000);
        CheckingAccount c1 = new CheckingAccount("9823948732",3000000);
        FixedDepositAccount f1 = new FixedDepositAccount("2354972456",500000);

        s1.displayAccountType();
        s1.displaySavingDetail();

        System.out.println("-----------------------------");

        c1.displayAccountType();
        c1.displayCheckingDetails();

        System.out.println("--------------------------------");

        f1.displayAccountType();
        f1.displayFDDetails();
    }
}
