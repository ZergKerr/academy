package by.academy.tasks.lesson4.arrays;

import java.util.Random;

public class Task6_IsArrayAscending {

	public static void main(String[] args) {
		int[] array = new int[4];
		int i = 0, sum = 1;
		Random rand = new Random();
		while (i < array.length) {
			array[i] = rand.nextInt(99 - 10) + 10;
			System.out.print(array[i] + " ");
			i++;
		}
		for (i = 1; i < array.length; i++) {
			if (array[i] >= array[i - 1]) {
				sum = sum + 1;
			}
		}
		if (sum == array.length) {
			System.out.println("\nThis array is ascending sequence!");
		}
	}
}
