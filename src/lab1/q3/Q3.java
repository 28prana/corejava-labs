package lab1.q3;

import java.util.*;

public class Q3 {

	public static void main(String[] args) {

		Function f = new Function();
		int n, a = 1, b = 1, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value:  ");
		n = sc.nextInt();
		f.nrcf(a, b, c, n);
		f.rcf(a, b, c, n);
		sc.close();
	}
}

class Function {
	void nrcf(int a, int b, int c, int n) {
		for (int i = 1; i <= n - 2; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		a = b = 1;
		System.out.println("nth value in the series using non recursive function is : " + c);
	}

	void rcf(int a, int b, int c, int n) {
		if (n - 2 > 0) {
			c = a + b;
			a = b;
			b = c;
			rcf(a, b, c, n - 1);
			return;
		}

		System.out.println("nth value in the series using recursive function is : " + c);
		
	}
}
