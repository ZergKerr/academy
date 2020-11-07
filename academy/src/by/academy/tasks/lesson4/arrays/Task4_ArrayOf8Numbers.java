package by.academy.tasks.lesson4.arrays;

import java.util.Random;

public class Task4_ArrayOf8Numbers {

	public static void main(String... args) {

		int[] array = new int[8];
		int i = 0;
		Random rand = new Random();
		while (i < array.length) {
			array[i] = rand.nextInt(11 - 1) + 1;
			System.out.print(array[i] + " ");
			i++;
		}
		System.out.println();
		for (i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				array[i] = 0;
			}
			System.out.print(array[i] + " ");
		}
	}
}
