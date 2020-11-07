package by.acacemy.testing;

public class Puppy {

	int puppyAge;

	public Puppy(String name) {
		// Это конструктор и у него один параметр, name.
		System.out.println("Передаваемое имя:" + name);
	}

	public void setAge(int age) {
		puppyAge = age;
	}

	public int getAge() {
		System.out.println("Возраст щенка:" + puppyAge);
		return puppyAge;
	}

	public static void main(String[] args) {
		/* Создание объекта. */
		Puppy myPuppy = new Puppy("Багет");

		/* Вызов метод класса, чтобы установить возраст щенка. */
		myPuppy.setAge(2);

		/* Вызов другого метода класса, чтобы получить возраст щенка. */
		myPuppy.getAge();

		/* Получение переменной экземпляра класса. */
		System.out.println("Значение переменной:" + myPuppy.puppyAge);

		String s = "Hello world";
		int a = s.length();
		System.out.println(a);

		String str1 = "hello";
		String str2 = "Hello";
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.compareTo(str2));
		
		StringBuilder str3 = new StringBuilder("This is a test.");
		System.out.println(str3.length());
		System.out.println(str3.capacity());
		
	}
}