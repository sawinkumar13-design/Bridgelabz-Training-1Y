import java.util.Scanner;
class StudentGrader{
 public static void main(String args[]){
	 Scanner input = new Scanner(System.in);
	 for(int i =1;i<=10;i++){
		System.out.println("enter marks : ");
		int marks = input.nextInt();
	 }
	 if(marks<50){
		 System.out.println("fail");
	 }
	 else if(marks>=50 && marks<60){
		 System.out.println("Grade d");
	 }
	 else if(marks>=60 && marks<70){
		 System.out.println("Grade c");
	 }
	 else if(marks>=70 && marks<80){
		 System.out.println("Grade b");
	 }
	 else if(marks>=80 && marks<90){
		 System.out.println("Grade a");
	 }
	 else if(marks>=90 && marks<=100){
		 System.out.println("Grade o");
	 }
	 else{
		 System.out.println("invalid number");
	 }
	}
}