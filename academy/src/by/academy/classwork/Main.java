package by.academy.classwork;

public class Main {
	public static void main(String... args) {
//		Man unidentified = new Man();
		Man petia = new Man("Petia");
		
		petia.addCounter();
		petia.addCounter();
		petia.addCounter();
		
		System.out.println(petia.counter);
//		System.out.println(unidentified.name);
		
//		System.out.println(petia.name);
//		petia.run(100);
	}
}
