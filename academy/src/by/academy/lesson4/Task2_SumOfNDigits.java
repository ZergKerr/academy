package by.academy.lesson4;

import java.util.Scanner;

public class Task2_SumOfNDigits {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Input integer number : ");
		int n = in.nextInt();
		in.close();
		int sum = 0;
		for (int i = 1; i < (n + 1); i++) {
			sum = sum + i;
		}
		System.out.println("Сумма целых чисел от 1 до " + n + " равна " + sum);
	}
}
