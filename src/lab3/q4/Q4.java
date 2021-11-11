package lab3.q4;

import java.util.Scanner;

public class Q4 {
	public static void main(String arr[]) {
		Scanner sc = new Scanner(System.in);
		int min = 9, max = 0, number, digit, diff;
		System.out.println("Enter any Integer Number : ");
		number = sc.nextInt();
		while (number > 0) {
			digit = number % 10;

			min = digit;

			number = number / 10;
		}
		diff = max - min;
		sc.close();
		System.out.println("Difference  Between consecutive numbers  Digit : " + diff);
	}

}
