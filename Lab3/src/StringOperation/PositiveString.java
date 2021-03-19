/**
* Name : Sagnik Maity
* Description : program of input string is positive or not
* Date : 3/17/2021
*/
package StringOperation;

import java.util.Scanner;

public class PositiveString {
	public static int isPositiveString(String str) {
		char[] characters= str.toCharArray();
		int total=0;
		for(int i=0;i<characters.length-1;i++) {
			if(characters[i]>characters[i+1]) {
				total+=1;
			}
		}
		return total;
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter input string : ");
		String input=scanner.nextLine();
		if(isPositiveString(input)>0) {
			System.out.println(input+" not a positive string");
		}
		else {
			System.out.println(input+" is a positive string");
		}

	}

}
