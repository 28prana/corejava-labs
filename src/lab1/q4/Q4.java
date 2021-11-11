package lab1.q4;

public class Q4 {

	public static void main(String[] args) {
		int count = 0;
		int stop = 10;
		for (int start = 1; start <= stop; start++) {
			int i = 2;
			for (; i < start; i++) {
				if (start % i == 0) {
					break;
				}
			}
			if (start == i) {
				count++;
			}
		}
		System.out.println(count);
	}

}
