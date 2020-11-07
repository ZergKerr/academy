package by.academy.tasks.lesson4.arrays;

import java.util.Random;

public class Task2_ArrayOfDoubles {
	
	public static void main(String[] args) {
		
		double[] c = new double[4];
		Random rand = new Random();
		for (int i = 0; i< 4; i++) {
		c[i] = rand.nextDouble();
		}
		System.out.println(c[0]);
	}

}
