import java.util.Scanner;

class Factor{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a number ");
		int number = input.nextInt();
		
		int maxFactor = 10;
		int factor[] = new int[maxFactor];		
		int index = 0;
		
		for(int i =1;i<=number;i++){
			if(number%i==0){
				if(index==maxFactor){
					maxFactor=maxFactor*2;
					int temp[] = new int[maxFactor];
					
					for(int j =0;j<index;j++){
						temp[j] = factor[j];
					}
					factor=temp;
				}
				factor[index]=i;
				index++;
			}
		}
		System.out.println("Factors of this number :");
        for (int i = 0; i < index; i++) {
            System.out.print(factor[i] + " ");
		}
	}
}