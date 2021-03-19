/**
* Name : Sagnik Maity
* Description : program to check if a number is an increasing number
* Date : 3/13/2021
*/
package exercise1;

import java.util.Scanner;

public class IncreasingNumber {
	public static boolean checkNumber(int number) {
		String str= String.valueOf(number);
		boolean check=true;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)>str.charAt(i+1)) {
				check=false;
				break;
			}
		}
		return check;
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Input Number");
		int number= scanner.nextInt();
		if(checkNumber(number)) {
			System.out.println(number+" is a increasing number");
		}
		else {
			System.out.println(number+" is not a increasing number");
		}
	}

}
