package lab5.q3;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class Q3 {
	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter salary");
		int salary = sc.nextInt();
		sc.close();

		try {
			if (salary < 3000) {
				throw new EmployeeException("Your Salary is below 3000"); // imported via package
			} else {
				System.out.println("you salary is above 3000");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
