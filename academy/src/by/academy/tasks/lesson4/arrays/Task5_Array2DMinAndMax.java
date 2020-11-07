package by.academy.tasks.lesson4.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task5_Array2DMinAndMax {

	public static void main(String... args) {
		int i, j;
		int[][] array = new int[5][8];
		int[][] array1 = new int[5][2];
		Random rand = new Random();
		System.out.println("Creating new array:");
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 8; j++) {
				array[i][j] = rand.nextInt(100 + 100) - 100;
				System.out.printf("%03d   ", array[i][j]);
			}
			System.out.println();
		}
		for (i = 0; i < 5; i++) {
			array1[i][0] = array[i][0];
			array1[i][1] = array[i][0];
			for (j = 1; j < 8; j++) {
				if (array[i][j] < array1[i][0]) {
					array1[i][0] = array[i][j];
				}
				if (array[i][j] > array1[i][1]) {
					array1[i][1] = array[i][j];
				}
			}
		}
		System.out.println("\nMin and max values of created array:");
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 2; j++) {
				System.out.printf("%03d   ", array1[i][j]);
			}
			System.out.println();
		}

	}
}
