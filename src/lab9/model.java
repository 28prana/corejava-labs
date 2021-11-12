package lab9;

import java.util.Scanner;

public class model {
	public static void main(String[] args) {

		App obj = () -> {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter x and y values:");
			return (long) Math.pow(sc.nextInt(), sc.nextInt());
		};
		System.out.println("x power y is: " + obj.powerOfX());

	}
}