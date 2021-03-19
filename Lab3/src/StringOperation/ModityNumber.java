/**
* Name : Sagnik Maity
* Description : Modify a number such that each of the digit in the new formed number is equal
*               to the difference between two consecutive digits in the original number
* Date : 3/17/2021
*/
package StringOperation;

import java.util.Scanner;

public class ModityNumber {
	public static int modifyOldNumber(int number) {
		String intToString= String.valueOf(number);
		char[] digit = new char[intToString.length()];
		int result=0;
		StringBuffer str=new StringBuffer();
		for(int i=0;i<intToString.length();i++) {
			digit[i]=intToString.charAt(i);
		}
		for(int j=0;j<digit.length-1;j++) {
			result=Math.abs(digit[j]-digit[j+1]);
			str.append(result);
		}
		result=Math.abs(digit[0]-digit[digit.length-1]);
		str.append(result);
		return Integer.parseInt(str.toString());
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter number :");
		int number=scanner.nextInt();
		System.out.println("output number after modification : "+modifyOldNumber(number));

	}

}
