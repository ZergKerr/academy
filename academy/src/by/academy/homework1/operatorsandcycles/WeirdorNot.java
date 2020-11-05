package by.academy.homework1.operatorsandcycles;

import java.util.Scanner;

public class WeirdorNot {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Input integer number: ");
		int N = in.nextInt();

		if ((N % 2) > 0 | (N > 6 & N < 20)) {
			System.out.println("Weird");
		} else if (N % 2 == 0) {
			System.out.println("Not Weird");
		}
		in.close();
	}
}
