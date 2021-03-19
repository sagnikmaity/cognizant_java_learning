/**
* Name : Sagnik Maity
* Description : Mirror image of a string
* Date : 3/17/2021
*/
package StringOperation;

import java.util.Scanner;

public class MirrorOfString {
	public static String getImage(String image) {
		StringBuffer str= new StringBuffer();
		StringBuffer str1= new StringBuffer();
		String duplicate= image;
		str.append(duplicate);
		str.reverse();
		str1.append(image);
		str1.append("|");
		str1.append(str);
		return str1.toString();
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Input : ");
		String image= scanner.next();
        System.out.println("output " +MirrorOfString.getImage(image));
	}

}
