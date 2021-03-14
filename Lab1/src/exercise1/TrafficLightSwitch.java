package exercise1;

import java.util.Scanner;

public class TrafficLightSwitch {
	public static void appropriateMessage(int num) {
		switch(num) {
		case 1:
			System.out.println("stop");
			break;
		case 2:
			System.out.println("go");
			break;
		case 3:
			System.out.println("ready");
			break;
		default:
			System.out.println("Invalid Input");
		}
	}

	public static void main(String[] args) {
		System.out.println("1. Red");
		System.out.println("2. Green");
		System.out.println("3. Yellow");
		Scanner scanner= new Scanner(System.in);
		System.out.println("Select the light : ");
		int choose= scanner.nextInt();
		appropriateMessage(choose);
	
	}

}
