package by.academy.classwork.lesson5;

public class Task2_TwoNumbers {

	public static void main(String[] args) {

		int a = 3;
		int b = 56;
		StringBuilder str = new StringBuilder();

		str.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n").
				append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n").
				append(a).append(" * ").append(b).append(" = ").append(a * b).toString();
		System.out.println(str);
				
		//Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
		
		str.deleteCharAt(7);
		str.insert(7, "равно");
		System.out.println(str);
	}
}
