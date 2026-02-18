import java.util.Scanner;

public class jaraBounce {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n =10;
        double[] salary = new double[n];
        double[] service = new double[n];
        double[] bonus = new double[n];
        double[] newSalary = new double[n];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for(int i=0;i<n;i++){
            System.out.println("enter salary ");
            double sal = input.nextDouble();

            System.out.println("enter year of services ");
            double serv = input.nextDouble();

            if(sal <= 0 || serv < 0) {
                System.out.println("enter valid salary and year of services ");
                i--;
                continue;
            }

            salary[i] = sal;
            service[i] = serv;
        }
        for(int i=0;i<n;i++){
            if (service[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalOldSalary += salary[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("Total Old Salary  : " + totalOldSalary);
        System.out.println("Total Bonus Paid  : " + totalBonus);
        System.out.println("Total New Salary  : " + totalNewSalary);
    }
}
