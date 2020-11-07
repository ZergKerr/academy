package by.academy.classwork.lesson5;

public class Task1_ILikeJava {

	public static void main(String[] args) {

		String str = "I like Java!!!";
		System.out.println(str);
		System.out.println("The last symbol of string is " + str.charAt(str.length()-1));
		System.out.println("The String ends with \"!!!\" - this is " + str.endsWith("!!!"));
		System.out.println("The String starts with \"I like\" - this is " + str.startsWith("I like"));
		System.out.println("The String contain substring \"Java\" - this is " + str.contains("Java"));
		System.out.println("The index of substring \"Java\" is " + str.indexOf("Java"));
		System.out.println(str.replace('a', 'o'));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(7, 11));
	}

}
