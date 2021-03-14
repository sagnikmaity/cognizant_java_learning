package exercise1;

import java.util.Scanner;

public class PrimeNumbers {
	public static String getAllPrimeNumber(int number) {
		String str="";
		for(int i=2;i<=number;i++) {
			boolean flag= true;
			for(int j=2; j<i;j++) {
				
				if(i%j==0) {
					flag=false;
				}
			}
				if(flag) {
					str+=" "+String.valueOf(i);
				}
			
		}
		return str;
	}

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Input a number");
		int number= scanner.nextInt();
		System.out.println("Prime numbers between 1 and "+number+" are "+getAllPrimeNumber(number));
	}

}
