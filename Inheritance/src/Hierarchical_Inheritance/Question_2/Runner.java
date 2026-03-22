package Hierarchical_Inheritance.Question_2;

public class Runner {
    public static void main(String[] args) {
        Teacher t = new Teacher("Amit", 35, "Mathematics");
        Student s = new Student("Riya", 16, "10th Grade");
        Staff st = new Staff("Raj", 40, "Administration");

        t.displayRole();
        t.displayTeacherDetail();

        System.out.println("-------------------------");

        s.displayRole();
        s.displayStudentDetail();

        System.out.println("---------------------------");

        st.displayRole();
        st.displayStaffDetail();
}
}
