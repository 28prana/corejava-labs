package lab3.q5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q5 {
	public static void main(String args[]) throws IOException {
		int numberOfLine = 1, numberOfWords = 0;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter File name: ");
		String str = sc.nextLine();
		FileInputStream f = new FileInputStream(str);
		int numberOfCharacters = f.available();
		System.out.println();
		for (int i = 0; i < numberOfCharacters; i++) {
			ch = (char) f.read();
			if (ch == '\n')
				numberOfLine++;
			else if (ch == ' ')
				numberOfWords++;

		}
		sc.close();
		f.close();
		System.out.println("\nNumber of lines : " + numberOfLine);
		System.out.println("\nNumber of words : " + (numberOfLine + numberOfWords));
		System.out.println("\nNumber of characters : " + numberOfCharacters);

	}

}
