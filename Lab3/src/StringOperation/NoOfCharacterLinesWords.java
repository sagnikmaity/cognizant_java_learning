/**
* Name : Sagnik Maity
* Description : Display no of characters, lines and words in a text
* Date : 3/17/2021
*/
package StringOperation;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NoOfCharacterLinesWords {
	public static int noOfCharacter(String text) {
		char[] characters= text.toCharArray();
		int totalNumber=0;
		for(int i=0;i<characters.length;i++) {
			if(Character.isAlphabetic(characters[i])) {
				totalNumber+=1;
			}
		}
		return totalNumber;
	}
	public static int noOfLines(String text) {
		StringTokenizer str= new StringTokenizer(text,".");
		return str.countTokens();
	}
	public static int noOfWords(String text) {
		String modify= text.replace('.',' ');
		char [] characters= modify.toCharArray();
		int countSpace=0;
		for(int i=0;i<characters.length;i++) {
			if(characters[i]==' ') {
				countSpace+=1;
			}
		}
		return countSpace+1;
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter text");
		String text= scanner.nextLine();
		System.out.println("No of character in text : "+noOfCharacter(text));
		System.out.println("No of line in text : "+noOfLines(text));
		System.out.println("No of word in text : "+noOfWords(text));
	}

}
