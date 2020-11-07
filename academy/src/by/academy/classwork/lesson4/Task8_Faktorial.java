package by.academy.classwork.lesson4;

public class Task8_Faktorial {

	public static void main(String[] args) {

		int n = (int) (Math.random() * 10);
		long sum = 1;
		for (int i = 1; i <= n; i++) {
			sum = sum * i;
		}
		System.out.println("Произведение целых чисел от 1 до " + n + " равна " + sum);
	}
}
