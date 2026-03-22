package Multilevel_Inheritance.Question_2;

public class PaidOnlineCourse extends OnlineCourse{
  double fee;
  double discount; // in percentage

public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded,
                 double fee, double discount) {
    super(courseName, duration, platform, isRecorded);
    this.fee = fee;
    this.discount = discount;
}
double getFinalFee() {
    return fee - (fee * discount / 100);
}
void displayPaidCourse() {
    displayOnlineCourse();
    System.out.println("Original Fee: " + fee);
    System.out.println("Discount: " + discount + "%");
    System.out.println("Final Fee: " + getFinalFee());
}
}