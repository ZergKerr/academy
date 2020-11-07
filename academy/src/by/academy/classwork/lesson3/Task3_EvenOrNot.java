package by.academy.classwork.lesson3;

import java.util.Scanner;

public class Task3_EvenOrNot {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Input number:");
		int number = in.nextInt();
		in.close();

		System.out.println(
				number % 2 == 0 ? "Inputed number " + number + " is even." : "Inputed number" + number + " is odd.");
	}
}
