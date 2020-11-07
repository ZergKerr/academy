package by.academy.classwork.lesson3;

import java.util.Scanner;

public class Task5_TwoNumbers {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Input integer number 1: ");
		int number1 = in.nextInt();
		System.out.print("Input integer number 2: ");
		double number2 = in.nextDouble();
		in.close();

		double b = (number1 + number2) / 2;

		System.out.println(number1 - number2 > 0 
				? "Number " + number1 + " is more than number " + number2 + ", average is " + b
				: "Number " + number2 + " is more than number " + number1 + ", average is " + b);
	}
}
