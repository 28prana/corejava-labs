package lab3.q3;

public class Q3 {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("JAVA");

		System.out.println(str + " changed to " + Q3.alterString(str));
	}

	public static StringBuffer alterString(StringBuffer str) {
		return str.replace(0, 1, "K");
	}
}
