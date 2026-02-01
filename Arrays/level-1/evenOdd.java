import java.util.Scanner;

class EvenOdd{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a natural number");
		int number = input.nextInt();
		 if(number<1){
			 System.out.println("enter a only natural number");
			 return;
		 }
		int even[] = new int[number/2+1];
		int odd[] = new int [number/2+1];
		
		int evenindex = 0;
		int oddindex = 0;
		
		for(int i =1;i<=number;i++){
			if(i%2==0){
				even[evenindex]=i;
				evenindex++;
			}
			else{
				odd[oddindex]=i;
				oddindex++;
			}
		}
		System.out.println("even numbers are : ");
		for(int i =0;i<evenindex;i++){
		 System.out.println(even[i]+" ");
		}
		System.out.println("odd number are : ");
		for(int i =0;i<oddindex;i++){
			System.out.println(odd[i]+" ");
		}
	}
}