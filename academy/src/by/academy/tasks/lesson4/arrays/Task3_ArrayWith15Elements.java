package by.academy.tasks.lesson4.arrays;

import java.util.Random;

public class Task3_ArrayWith15Elements {

	public static void main(String... args) {

		int[] array = new int[15];
		int i=0, even = 0;
		Random rand = new Random();
		while (i<array.length) {
			array[i] = rand.nextInt(10);
			System.out.print(array[i] + " ");
			if (array[i]%2 == 0) {
				even = even + 1;
			}
			i++;
		}
		System.out.println("\nThere are " + even + " even numbers in this array.");
	}
}

