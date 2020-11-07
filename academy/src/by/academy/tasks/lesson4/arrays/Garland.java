package by.academy.tasks.lesson4.arrays;

import java.util.Random;
import java.util.Scanner;

public class Garland {

	public static void main(String[] args) {
		int n = 0;
		Random rand = new Random();
		int l = rand.nextInt();
		System.out.println(Integer.toBinaryString(l));
		Scanner in = new Scanner(System.in);
		System.out.print("Input garland working cycle: ");

		if (in.hasNextInt()) {
			n = in.nextInt();
		} else {
			System.out.println("Incorrect input. Please, restart the program and try again!");
			System.exit(0);
		}
		in.close();
		
		System.out.println();
		for (int j = 0; j < n; j++) {
			l = ~l;
			System.out.println(Integer.toBinaryString(l));
		}
	}
}
