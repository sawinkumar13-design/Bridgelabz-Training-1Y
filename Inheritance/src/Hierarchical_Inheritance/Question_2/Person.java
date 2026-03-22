package Hierarchical_Inheritance.Question_2;

public class Person {
    String name;
    int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
