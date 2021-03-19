/**
* Name : Sagnik Maity
* Description : program to accept a string and replace all the consonants in the string with the next alphabet
* Date : 3/17/2021
*/
package StringOperation;

import java.util.Scanner;

public class ConsonantOfString {
	public static String alterString(String text) {
		StringBuffer str= new StringBuffer();
		char[] character= new char[text.length()];
		for(int i=0;i<character.length;i++) {
			character[i]= text.charAt(i);
			char alphabet= character[i];
			
			if(alphabet!='A'&& alphabet!='E' && alphabet!='I' && alphabet!='O' &&alphabet!='U'&&
				alphabet!='a'&& alphabet!='e'&& alphabet!='i' &&alphabet!='o' &&alphabet!='u'){
				if(alphabet=='z' || alphabet=='Z') {
					alphabet=(char)(alphabet-25);
					character[i]=alphabet;
				}
				else {
					alphabet=(char)(alphabet+1);
					character[i]=alphabet;
				}
			}
			else {
				character[i]=alphabet;
			}
		}
		for(int j=0;j<character.length;j++) {
			str.append(character[j]);
		}
		return str.toString();
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Input the text");
		String text= scanner.nextLine();
        System.out.println("Output : "+alterString(text));
       
	}

}
