package Hierarchical_Inheritance.Question_2;

public class Teacher extends Person{

    String subject;

    public Teacher(String name, int age,String subject) {
        super(name, age);
        this.subject=subject;
    }
    public void displayRole(){
        System.out.println("Role : Teacher");
    }
    public void displayTeacherDetail(){
        displayDetails();
        System.out.println("subject : "+subject);
    }
}
