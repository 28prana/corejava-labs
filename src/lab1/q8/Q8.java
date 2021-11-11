package lab1.q8;

public class Q8 {

	private static boolean Checknumber(int number) {
		if (number <= 0) {
			return false;
		}
		while (number > 1) {
			if (number % 2 != 0) {
				return false;
			}
			number = number / 2;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Number is a power of two is : " + Checknumber(1));
	}

}
