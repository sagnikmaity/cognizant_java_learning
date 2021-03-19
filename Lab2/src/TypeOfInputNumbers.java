/**
* Name : Sagnik Maity
* Description : Display total no of positive numbers,negative numbers, odd numbers, even numbers and 0s in an array
* Date : 3/15/2021
*/
import java.util.Scanner;

public class TypeOfInputNumbers {
	public static int number;
	public static int[] array;
	public static int totalPositiveNumbers() {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]>0) {
				sum+=1;
			}
		}
		return sum;
	}
	
	public static int totalNegativeNumbers() {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]<0) {
				sum+=1;
			}
		}
		return sum;
	}
	
	public static int totalZeroNumbers() {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==0) {
				sum+=1;
			}
		}
		return sum;
	}
	
	public static int totalOddNumbers() {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2!=0) {
				sum+=1;
			}
		}
		return sum;
	}
	
	public static int totalEvenNumbers() {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				sum+=1;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter 20 integer input");
		array= new int[20];
		for(int i=0;i<array.length;i++) {
			int input=scanner.nextInt();
			array[i]=input;
		}
		System.out.println("total positive numbers "+totalPositiveNumbers());
		System.out.println("total negative numbers "+totalNegativeNumbers());
		System.out.println("total zero numbers "+totalZeroNumbers());
		System.out.println("total odd numbers "+totalOddNumbers());
		System.out.println("total even numbers "+totalEvenNumbers());
	}

}
