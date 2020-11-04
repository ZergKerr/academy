package by.acacemy.testing;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CyclesandMassives {

	public static void main(String... args) {
		int arrayLength = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Input array length: ");
		if (in.hasNextInt()) {
			arrayLength = in.nextInt();
		} else {
			System.out.println("Некорректный размер массива. Перезапустите программу и попробуйте снова!");
			System.exit(0);
		}
		in.close();

		if (arrayLength <= 0) {
			System.out.println("Некорректный размер массива. Перезапустите программу и попробуйте снова!");
			System.exit(0);
		}

		Random rand = new Random();
		int[] array = new int[arrayLength];
		System.out.println("Creating array:");
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
			System.out.print(array[i] + "\t");
		}
		System.out.println("\nSorted array:");
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

	}
}