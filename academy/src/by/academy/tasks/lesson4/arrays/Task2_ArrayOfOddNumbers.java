package by.academy.tasks.lesson4.arrays;

public class Task2_ArrayOfOddNumbers {

	public static void main(String... args) {

		int[] array = new int[50];
		int i = 1, j = 0;
		while (i < 100) {
			array[j] = i;
			i = i + 2;
			j++;
		}
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (i = (array.length - 1); i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
}
