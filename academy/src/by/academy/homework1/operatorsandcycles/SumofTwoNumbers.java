package by.academy.homework1.operatorsandcycles;

import java.util.Scanner;

public class SumofTwoNumbers {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Input integer number 1: ");
		int number1 = in.nextInt();
		System.out.print("Input integer number 2: ");
		int number2 = in.nextInt();
		in.close();

		System.out.println("The sum of 2 inputed numbers is " + (number1 + number2));

	}
}
