package by.academy.tasks.lesson4.arrays;

import java.util.Random;

public class Task8_MaxElementOfArray {

	public static void main(String[] args) {
		
		int[] array = new int[12];
		int i = 0, index = 0;
		Random rand = new Random();
		while (i < array.length) {
			array[i] = rand.nextInt(15 + 15) - 15;
			System.out.print(array[i] + " ");
			i++;
		}
		int max = array[0];
		for (i = 1; i<12; i++) {
			if (array[i]>max) {
				max = array[i];
				index = i;
			}
		}
		System.out.println("\nThe maximum element of the array is " + max + ", its index is " + (index + 1));
	}
}
