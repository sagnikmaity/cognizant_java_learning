package exercise1;

import java.util.Scanner;

public class CubeOfDigits {
	static int sumOfCubes;
	public static int cubeSum(int num) {
		int cubeNum=0;
		int remainder;
		while(num>0) {
			remainder=num%10;
			cubeNum +=(remainder*remainder*remainder);
			num= num/10;
		}
		return cubeNum;
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Input the number");
		int num= scanner.nextInt();
		sumOfCubes= cubeSum(num);
		System.out.println("Sum of a cubes of the digits of "+num+" is "+sumOfCubes);
	}

}
