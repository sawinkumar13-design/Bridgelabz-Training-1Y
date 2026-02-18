/*import java.util.Scanner;

class TowSum{
	public static void main(String args[]){
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int target = 15;

		for(int i =0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==target){
					System.out.println(arr[i]+"+"+arr[j]+"="+target);
				}
			}
			
		}
	}
}
*/
import java.util.Scanner;
class OneDToTwoD{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int arr2[] = {1,2,3,4,5,6,7,8,9};
		int rows = 3;
		int cols = 3;
		int arr3[][] = new int[rows][cols];
		int index = 0;
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr3[i][j] = arr2[index];
                index++;
            }
        }
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            System.out.print(arr3[i][j]+" "); 
        }
		System.out.print(); 
	}
}
}