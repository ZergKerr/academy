package by.academy.homework1.operatorsandcycles;

import java.util.Scanner;

public class Task1_PurchaseWithDiscount {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Input purchase cost: ");
		double cost = in.nextDouble();
		System.out.print("Input customer age: ");
		int age = in.nextInt();
		in.close();

		if (cost < 100) {
			cost = 0.95 * cost;
		} else if (cost >= 100 & cost < 200) {
			cost = 0.93 * cost;
		} else if (cost >= 200 & cost < 300 & age > 18) {
			cost = 0.84 * cost;
		} else if (cost >= 200 & cost < 300 & age <= 18) {
			cost = 0.91 * cost;
		} else if (cost >= 300 & cost < 400) {
			cost = 0.85 * cost;
		} else
			cost = 0.8 * cost;

		System.out.printf("The final price including discount is %.2f", cost);

	}
}
