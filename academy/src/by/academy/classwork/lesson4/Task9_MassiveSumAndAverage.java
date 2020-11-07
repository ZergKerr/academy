package by.academy.classwork.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task9_MassiveSumAndAverage {
	
	public static void main(String... args) {

		int arrayLength = 0, sum = 0, counter = 0;
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
			array[i] = rand.nextInt(100 + 100) - 100;
			System.out.print(array[i] + " ");
			sum = sum + array[i];
		}
			int average = sum / array.length;
			System.out.println("\nIn the array there are following elements that are less than array average " + average + ":");
			for (int i = 0; i < array.length; i++) {
				if (array[i] < average) {
					System.out.print(array[i] + " ");
				}
			}
	}
}
