import java.util.Scanner;

class GreaterPositive{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int arr[] = new int[5];
		System.out.println("enter 5 integer");
		for(int i =0;i<arr.length;i++){
			arr[i] = input.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				if(arr[i]%2==0){
					System.out.println("this number is positive & even");
				}
				else{
					System.out.println("this number is positive & odd");
				}
			}
			else if(arr[i]==0){
				System.out.println("0 is zero");
			}
			else {
				System.out.println("number is negative");
			}
		}
			if(arr[0]==arr[4]){
				System.out.println("first and last element are equal");
			}
			else if(arr[0]>=arr[4]){
				System.out.println("first element is greater than last element ");
			}
			else{
				System.out.println("first element is less than last element");
			}
	}
}