package lab1.q5;

public class Q5 {
	public static void main(String[] args) {
		Q5 ref = new Q5();
		System.out.println(ref.calculateSum(50));
	}

	int calculateSum(int i) {
		int Sum1, Sum2, Sum3;

		Sum1 = ((i / 3)) * (2 * 3 + (i / 3 - 1) * 3) / 2; 
		Sum2 = ((i / 5)) * (2 * 5 + (i / 4 - 1) * 5) / 2;
		Sum3 = ((i / 15)) * (2 * 15 + (i / 15 - 1) * 15) / 2;

		return Sum1 + Sum2 - Sum3;
	}
}