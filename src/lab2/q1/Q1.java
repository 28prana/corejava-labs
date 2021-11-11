package lab2.q1;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

	public static int getSecondSmallest(int[] array) {

		Arrays.sort(array);
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i + 1] > array[i]) {
				count = array[i + 1];
				break;
			}
		}
		return count;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Size of the Array");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		int obj = Q1.getSecondSmallest(array);
		System.out.println("The Second Smallest number is: " + obj);
		scanner.close();

	}

}