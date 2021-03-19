/**
* Name : Sagnik Maity
* Description : program to check entered number power of 2 or not
* Date : 3/13/2021 
*/
package exercise1;

import java.util.Scanner;

public class PowerOfTwo {
	public static boolean checkNumber(int number) {
		boolean flag=true;
		int temporaryNum= number;
		while(temporaryNum!=1) {
			if(temporaryNum%2!=0) {
				flag=false;
				break;
			}
			temporaryNum=temporaryNum/2;
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number");
		int number= scanner.nextInt();
		if(checkNumber(number)) {
			System.out.println(number+" is power of 2 ");
		}
		else {
			System.out.println(number+" is not power of 2");
		}
	}

}
