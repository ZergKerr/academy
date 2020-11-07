package by.academy.tasks.lesson4.arrays;

import java.util.Random;

public class Task4_Char2DArray {

	public static void main(String... args) {
		
		char[][] array = new char[4][2];
		Random rand = new Random();
		for(int i =0; i < 4; i++) {
			for (int j = 0; j<2; j++) {
				array[i][j] = (char) (rand.nextInt(122 - 96) + 96);
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
