package by.academy.tasks.lesson4.arrays;

import java.util.Random;

public class Task5_AverageOf2Arrays {

	public static void main(String[] args) {

		int[] array1 = new int[5];
		int[] array2 = new int[5];
		int i = 0;
		float av1 = 0, av2 = 0;
		Random rand = new Random();
		while (i < array1.length) {
			array1[i] = rand.nextInt(6);
			array2[i] = rand.nextInt(6);
			System.out.print(array1[i] + " ");
			av1 = av1 + array1[i];
			av2 = av2 + array2[i];
			i++;
		}
		System.out.println();
		for (i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		av1 = av1 / array1.length;
		av2 = av2 / array2.length;
		if (av1 > av2) {
			System.out.println("\nThe average of array1 " + av1 + " is more than average of array2 " + av2);
		} else if (av1 < av2) {
			System.out.println("\nThe average of array2 " + av2 + " is more than average of array1 " + av1);
		} else {
			System.out.println("\nThe average of both arrays is equal to " + av1);
		}
	}
}
