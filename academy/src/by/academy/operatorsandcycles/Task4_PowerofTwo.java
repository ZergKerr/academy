package by.academy.operatorsandcycles;

public class Task4_PowerofTwo {

	public static void main(String[] args) {

		for (int i = 1;; i++) {

			if (Math.pow(2, i) > 1_000_000) {
				System.out.println("Limit reached!");
				System.exit(0);
			} else {
				System.out.printf("2 at degree of " + i + " is equal to %.0f \n", Math.pow(2, i));
			}
		}
	}
}