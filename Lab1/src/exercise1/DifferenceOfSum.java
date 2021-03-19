/**
* Name : Sagnik Maity
* Description : program to find the difference between the sum of the squares and the square of the sum
*               of the first n natural number
* Date : 3/13/2021
*/
package exercise1;

import java.util.Scanner;

public class DifferenceOfSum {
	public static int calculateDifference(int totalNumber) {
		int sum1=0;
		int sum2=0;
		int sum=0;
		int sum3=0;
		for(int i=1;i<=totalNumber;i++) {
			sum1+=(i*i);
		}
		
		for(int i=1;i<=totalNumber;i++) {
			sum2+=i;
		}
		
		sum3+=(sum2*sum2);
		
		sum+=Math.abs(sum1-sum3);
		
		return sum;
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
	    System.out.println("Input total no of natural number");
	    int totalNumber= scanner.nextInt();
	    System.out.println("Difference between sum of the square and square of the sum of "+totalNumber+" natural no is : "+calculateDifference(totalNumber));
	}

}
