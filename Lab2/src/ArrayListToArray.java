/**
* Name : Sagnik Maity
* Description : program to convert ArrayList to  an array
* Date : 3/15/2021
*/
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

	public static void main(String[] args) {
	ArrayList<Integer> arrayList= new ArrayList();
	arrayList.add(1);
	arrayList.add(12);
	arrayList.add(26);
	arrayList.add(62);
	
	int [] newArray= new int[arrayList.size()];
    for(int i=0;i<newArray.length;i++) {
    	newArray[i]=arrayList.get(i);
    }
    for(int j=0;j<newArray.length;j++) {
    	System.out.println(newArray[j]);
    }
	}
}
  
