package lab1.q1;

import java.util.*;

public class Q1 {

	public static void main(String[] args) {

		int input = 0;

		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		input = Integer.parseInt(sc.nextLine());

		int number = input;
		int counter = 0;
		while (number > 0) {
			int m = number % 10;
			System.out.println("Cube of " + m + " is " + (m * m * m));
			counter = counter + 1;
			number = number / 10;

			sc.close();

		}
	}
}
