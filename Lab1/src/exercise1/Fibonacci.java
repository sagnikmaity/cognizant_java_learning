/**
* Name : Sagnik Maity
* Description : program to find and display n th number in fibonacci series which taken from user
* Date : 3/13/2021
*/
package exercise1;

import java.util.*;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("which term of fibonacci series need to be print");
		int num= scanner.nextInt();      
		String str=generateFibonacci(num).toString();
		String[] str1= str.split(" ");
		
		int lastNumber= Integer.parseInt(str1[str1.length-1]);
		System.out.println(num+"th term of fibonacci series is "+lastNumber);

	}

	private static StringBuilder generateFibonacci(int num) {
		StringBuilder sb= new StringBuilder();
		String str="";
		int firstNumber=0;
		int secondNumber=1;
		sb.append(firstNumber);
		sb.append(" ");
		sb.append(secondNumber);
		int sum;
		for(int i=0;i<num-2;i++) {  
			sum= firstNumber + secondNumber;
			firstNumber= secondNumber;
			secondNumber= sum;
			str=" "+String.valueOf(sum);
			sb.append(str);
		
		}
		return sb;
}
}