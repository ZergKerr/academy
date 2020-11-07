package by.academy.tasks.lesson4.arrays;

public class Task1_ArrayOfEvenNumbers {

	public static void main(String... args) {

		int[] array = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int i;
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
