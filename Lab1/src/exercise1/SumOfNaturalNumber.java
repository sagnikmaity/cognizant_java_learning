/**
* Name : Sagnik Maity
* Description : calculate sum of first n natural number which are divisible by 3 or 5
* Date : 3/13/2021
*/
package exercise1;

import java.util.Scanner;

public class SumOfNaturalNumber {
	public static int calculateSum(int total) {
		int sum=0;
		for(int i=0;i<=total;i++) {
			if(i%3==0 || i%5==0) {
				sum= sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
	    System.out.println("Input total no of natural number");
	    int total= scanner.nextInt();
	    System.out.println("Sum of first "+total+" natural number : "+calculateSum(total));
	}

}
