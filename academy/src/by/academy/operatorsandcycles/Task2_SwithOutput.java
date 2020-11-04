package by.academy.operatorsandcycles;

import java.util.Scanner;

public class Task2_SwithOutput {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Input data type from the list: int, double, float, char or string: ");
		String datatype = in.nextLine();
		System.out.print("Input data value: ");
		String datavalue = in.nextLine();
		in.close();

		switch (datatype) {
		case "int":
			int i = Integer.parseInt(datavalue);
			System.out.printf("The remain of divide " + i + " by 2 is equal to %d", (i % 2));
			break;
		case "double":
			double d = Double.parseDouble(datavalue);
			System.out.println("70% of " + datavalue + " is equal to " + (d * 0.7));
			break;
		case "float":
			float f = Float.parseFloat(datavalue);
			System.out.println("Square " + datavalue + " is equal to " + (f * f));
			break;
		case "char":
			char c = (char) datavalue.charAt(0);
			System.out.println("The Unicode value of a " + datavalue + " is: " + (int) c);
			break;
		case "string":
			System.out.println("Hello " + datavalue);
			break;
		default:
			System.out.println("Unsupported type");
		}
	}
}
