package by.academy.tasks.lesson4.arrays;

public class Task7_FibonacciNumbers {

	public static void main(String[] args) {
		
		int[] array = new int[20];
		array[0] = array[1] = 1;
		
		System.out.print("The first 20 Fibonacci numbers are:\n" + array[0] + " " + array[1] + " ");
		for (int i = 2; i<20; i++) {
			array[i] = array[i-1] + array[i-2];
			System.out.print(array[i] + " "); 
		}
	}
}
