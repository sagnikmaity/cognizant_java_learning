/**
* Name : Sagnik Maity
* Description : program to find the length of the longest consecutive elements sequence from a given unsorted 
*               array of integers
* Date : 3/15/2021
*/
import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutive {
	public static int longestConsecutiveElements(int[] arrays) {
		Arrays.sort(arrays);
		int count = 1;
		int maximum = 1;
		for(int i = 1; i<arrays.length; i++){
			if(arrays[i-1]==arrays[i]){
				//Do nothing
			}else if(arrays[i-1]+1==arrays[i]){
				count++;
			} else {
				count = 1;
			}
			
			maximum = Math.max(count, maximum);
		}
		return Math.min(arrays.length, maximum);
	
}

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int [] array;
		System.out.println("Total no of element of an array");
		int number= scanner.nextInt();
		array= new int[number];
		System.out.println("Enter the elements");
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
		}
		System.out.println("sequence : "+longestConsecutiveElements(array));
}
}

