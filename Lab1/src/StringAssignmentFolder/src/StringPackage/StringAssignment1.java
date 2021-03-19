/**
* Name : Sagnik Maity
* Description : Reverse the text word by word
* Date : 3/13/2021 
*/
package StringPackage;

public class StringAssignment1 {

	public static void main(String[] args) {
		String str = "Hello My Dear Friends";
		
		/*Challenge :  Write your logic here so that the output should be in reverse order. It should be displayed as
		 * Friends Dear My Hello.
		 * You need to reverse the String word by word. 
		 * Limitation :  Do not use the reverse method
		 */
		String afterReverse="";
		String[] everyWordFromStartToEnd= str.split(" ");
		for(int i=everyWordFromStartToEnd.length-1;i>=0;i--) {
			afterReverse+= " "+everyWordFromStartToEnd[i];
		}
		System.out.println(afterReverse.trim());
	}

}
