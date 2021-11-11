package lab1.q2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("select you choice: Red,Yellow,Green");

		String colour = sc.next();
		switch (colour) {
		case "Red":
			System.out.println("Stop");
			break;
		case "Yellow":
			System.out.println("Ready");
			break;
		case "Green":
			System.out.println("GO");
			break;
		default:
			System.out.println("wrong decision");
			sc.close();

		}
	}

}
