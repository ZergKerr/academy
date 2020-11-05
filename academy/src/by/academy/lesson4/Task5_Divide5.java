package by.academy.lesson4;

public class Task5_Divide5 {

	public static void main(String[] args) {

		int i = 1;
		do {
			if (i % 5 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 100);
	}
}
