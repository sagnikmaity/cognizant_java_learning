package exercise1;

import java.util.Scanner;

public class TrafficLightIfElse {

	public static void main(String[] args) {
		System.out.println("1. Red");
		System.out.println("2. Green");
		System.out.println("3. Yellow");
		Scanner scanner= new Scanner(System.in);
		System.out.println("Select the light : ");
		int choose= scanner.nextInt();
		appropriateMessage(choose);

	}

	private static void appropriateMessage(int choose) {
		if(choose==1) {
			System.out.println("stop");
		}
		else if(choose==2) {
			System.out.println("go");
		}
		else if(choose==3) {
			System.out.println("ready");
		}
		else {
			System.out.println("Invalid Input");
		}
		
	}

}
