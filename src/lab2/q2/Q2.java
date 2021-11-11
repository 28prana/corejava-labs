package lab2.q2;

import java.util.Arrays;

public class Q2 {

	public String[] sortStrings(String[] arr) {
		Arrays.sort(arr);

		return arr;
	}

	public static void main(String[] args) {
		String[] arr = { "PRANALI", "ShubhangI", "Poonam", "KalpaNA", "KishOR", "SWApNIL" };
		Q2 obj = new Q2();
		String[] sorted = obj.sortStrings(arr);
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i] + " ");

		}
		System.out.println();
		for (int i = (sorted.length / 2) + 1; i < sorted.length; i++) {
			System.out.print(sorted[i].toUpperCase() + " ");
		}
	}

}
