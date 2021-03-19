/**
* Name : Sagnik Maity
* Description : program to return second smallest element of an array and display
* Date : 3/15/2021
*/
import java.util.Scanner;

public class SecondSmallestElement {
	public static int getSecondSmallest(int[] array) {
		int temp=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++)
			  if(array[i]>array[j]) {
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		int number=array[1];
		return number;
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Total no of elements of an input array");
		int elements= scanner.nextInt();
		int[] array=new int[elements];
		System.out.println("Enter the elements");
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
		}
		System.out.println("Second smallest number is :"+getSecondSmallest(array));
	}

}
