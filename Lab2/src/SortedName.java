/**
* Name : Sagnik Maity
* Description : display sorted list of product names
* Date : 3/15/2021
*/
import java.util.Scanner;
public class SortedName {
	public static String getSortedProductNames(String[] str) {
		String s1="";
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].compareTo(str[j])>0) {
					s1=str[i];
					str[i]=str[j];
					str[j]=s1;
				}
			}
		}
		for(int k=0;k<str.length;k++) {
			sb.append(str[k]).append(" ");
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Total no of products");
		int totalProducts= scanner.nextInt();
		System.out.println("Enter product names");
		String[] product= new String[totalProducts];
		for(int i=0;i<totalProducts;i++) {
			product[i]=scanner.next();
		}
		System.out.println("sorted product names : "+getSortedProductNames(product));
		
	}

}
