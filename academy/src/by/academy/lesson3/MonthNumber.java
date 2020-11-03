package by.academy.lesson3;

import java.util.Scanner;

public class MonthNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Input month name, first letter must be big:");
		String monthName = in.nextLine();
		in.close();

		switch (monthName) {
		case "January":
			System.out.println("1");
			break;
		case "February":
			System.out.println("2");
			break;
		case "March":
			System.out.println("3");
			break;
		case "April":
			System.out.println("4");
			break;
		case "May":
			System.out.println("5");
			break;
		case "June":
			System.out.println("6");
			break;
		case "July":
			System.out.println("7");
			break;
		case "August":
			System.out.println("8");
			break;
		case "September":
			System.out.println("9");
			break;
		case "October":
			System.out.println("10");
			break;
		case "November":
			System.out.println("11");
			break;
		case "December":
			System.out.println("12");
			break;
		default:
			System.out.println("Unsupported input or incorrect month name. Please, try again.");
			break;
		}
	}
}
