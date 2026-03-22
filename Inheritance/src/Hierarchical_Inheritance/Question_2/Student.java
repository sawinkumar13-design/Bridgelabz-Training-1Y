package Hierarchical_Inheritance.Question_2;

public class Student extends Person{

    String grade;

    public Student(String name, int age,String grade) {
        super(name, age);
        this.grade=grade;
    }
    public void displayRole(){
        System.out.println("Role : Student");
    }
    public void displayStudentDetail(){
        displayDetails();
        System.out.println("grade "+grade);
    }
}
