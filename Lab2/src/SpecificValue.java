/**
* Name : Sagnik Maity
* Description : program to test if an array contains a specific value
* Date : 3/15/2021
*/
import java.util.Scanner;

public class SpecificValue {
	public static int totalNumber;
	public static int[] testArray;
	public static int searchNumber;

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("No of element you need to put");
	     totalNumber= scanner.nextInt();
	     testArray= new int[totalNumber];
	     
	     System.out.println("Values are ");
	     for(int i=0;i<testArray.length;i++) {
	    	 testArray[i]=scanner.nextInt();
	     }
	    
	     System.out.println("Number to be search");
	     searchNumber=scanner.nextInt();
		 
	     searchElement(searchNumber);
	}

	   public static void searchElement(int searchNumber) {
		   boolean flag=false;
		   for(int j=0;j<testArray.length;j++) {
			   if(testArray[j]==searchNumber) {
				   flag=true;
			   }
		   }
		   if(flag==true) {
			   System.out.println("Array contain "+searchNumber);
		   }
		   else {
			   System.out.println("Array doesn't contain "+searchNumber);
		   }
	   }
}
