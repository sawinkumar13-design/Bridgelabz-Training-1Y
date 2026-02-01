import java.util.Scanner;

class Voter{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int arr[] = new int[10];
		System.out.println("enter age of 10 students : ");
		for(int i = 0;i<10;i++){
			arr[i] = input.nextInt();
		}
		
		for(int i =0;i<arr.length;i++){
			if(arr[i]<0){
				System.out.println("invalid age");
			}
			else if(arr[i]>=18){
				System.out.println("The student with the age"+arr[i]+"can vote");
			}
			else{
				System.out.println("The student with the age"+arr[i]+"can't vote");
			}
		}
	}
}