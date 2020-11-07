package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task4_1_InputOfNDigits {

	public static void main(String[] args) {

		int c, plus = 0, minus = 0, zero = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Input quantity of digits : ");
		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Input next integer number:");
			c = in.nextInt();
			if (c > 0)
				plus = plus + 1;
			else if (c < 0)
				minus = minus + 1;
			else
				zero = zero + 1;
		}
		in.close();
		System.out.println("You have inputed " + plus + " positive numbers, " + minus + " negative numbers and " + zero
				+ " zeros");
	}
}
