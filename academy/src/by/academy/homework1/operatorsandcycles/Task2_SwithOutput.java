package by.academy.homework1.operatorsandcycles;

import java.util.Scanner;

public class Task2_SwithOutput {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Input data type from the list: int, double, float, char or string: ");
		String dataType = in.nextLine();
		System.out.print("Input data value: ");
		String dataValue = in.nextLine();
		in.close();

		switch (dataType) {
		case "int":
			int i = Integer.parseInt(dataValue);
			System.out.printf("The remain of divide " + i + " by 2 is equal to %d", (i % 2));
			break;
		case "double":
			double d = Double.parseDouble(dataValue);
			System.out.println("70% of " + dataValue + " is equal to " + (d * 0.7));
			break;
		case "float":
			float f = Float.parseFloat(dataValue);
			System.out.println("Square " + dataValue + " is equal to " + (f * f));
			break;
		case "char":
			char c = (char) dataValue.charAt(0);
			System.out.println("The Unicode value of a " + dataValue + " is: " + (int) c);
			break;
		case "string":
			System.out.println("Hello " + dataValue);
			break;
		default:
			System.out.println("Unsupported type");
		}
	}
}
