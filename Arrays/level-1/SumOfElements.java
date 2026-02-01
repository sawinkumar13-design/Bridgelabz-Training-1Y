import java.util.Scanner;

class SumOfElements{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		double number[] = new double[10];
		double total = 0.0;
		int index =0;
		while(true){
			System.out.println("enter a number");
			double value = input.nextDouble();
			if(value<=0){
			    break;
		    }
			if(index==10){
				break;
			}
			number[index]=value;
			index++;
		}
		for(int i =0;i<index;i++){
			total+=number[i];
		}
		System.out.println("Sum of all numbers: " + total);
	}
}