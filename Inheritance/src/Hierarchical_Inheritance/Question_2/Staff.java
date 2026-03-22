package Hierarchical_Inheritance.Question_2;

public class Staff extends Person{

    String department;

    public Staff(String name, int age,String department) {
        super(name, age);
        this.department=department;
    }
    public void displayRole(){
        System.out.println("Role : Staff");
    }
    public void displayStaffDetail(){
        displayDetails();
        System.out.println("department : "+department);
    }
}
