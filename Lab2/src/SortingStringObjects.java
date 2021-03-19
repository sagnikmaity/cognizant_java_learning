/**
* Name : Sagnik Maity
* Description : program to accept an array of string objects and short in alphabetical order
* Date : 3/15/2021
*/
import java.util.Scanner;

public class SortingStringObjects {
	public static String sortString(String[] arr) {
		String temp="";
		StringBuffer sb= new StringBuffer();
	    int length= arr.length;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		if(arr.length%2==0) {
			for(int i=0;i<(arr.length)/2;i++) {
				sb.append(arr[i].toUpperCase()).append(" ");
			}
			for(int i=(arr.length)/2;i<arr.length;i++) {
				sb.append(arr[i].toLowerCase()).append(" ");
			}
		}
		if(arr.length%2!=0) {
			for(int i=0;i<((arr.length)+1)/2;i++) {
				sb.append(arr[i].toUpperCase()).append(" ");
			}
			for(int i=((arr.length)+1)/2;i<arr.length;i++) {
				sb.append(arr[i].toLowerCase()).append(" ");
			}
		}
		return sb.toString();
	
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Total no of elements");
		int elements=scanner.nextInt();
		String[] arr= new String[elements];
		System.out.println("Input "+elements+" elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.next();
		}
		System.out.println("After sorting  "+sortString(arr));
	}

}
