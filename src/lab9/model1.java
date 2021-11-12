package lab9;

import java.util.*;

public class model1 {
	public static void main(String[] args) {

		App1 obj = () -> {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string: ");
			return sc.next().replace("", " ").trim();
		};
		System.out.println("Output string: " + obj.addSpace());
	}
	
}