package by.academy.homework1.operatorsandcycles;

import java.util.Scanner;

public class Task3_MultiplicationTable {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Input number for multiplication table output: ");
		if (in.hasNextInt()) {
			int t = in.nextInt();
			for (int i = 1; i <= 10; i++) {
				System.out.println(t + " * " + i + " = " + (i * t));
			}
		} else {
			System.out.println("You inputed incorrected value. Please, try again.");
			System.exit(0);
		}
		in.close();
	}

}
