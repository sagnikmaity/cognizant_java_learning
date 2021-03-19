/**
* Name : Sagnik Maity
* Description : Display list of products with duplicate values
* Date : 3/15/2021
*/
import java.util.Scanner;

public class DublicateValues {
	public static String getDuplicateValues(int[] arr) {
		String duplicateList= "";
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count+=1;
				}
			}
				if(count>=1) {
					if(!duplicateList.contains(String.valueOf(arr[i]))){
						duplicateList+=String.valueOf(arr[i])+" ";
					}
				}
			
	     }
		return duplicateList;
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Total no of element of an input array");
		int inputNoOfElements= scanner.nextInt();
		System.out.println("Enter the numbers");
		int[] inputArray= new int[inputNoOfElements];
		for(int i=0;i<inputNoOfElements;i++) {
			inputArray[i]=scanner.nextInt();
		}
		System.out.println("Duplicate number : "+getDuplicateValues(inputArray));
	}

}
