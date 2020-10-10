package by.academy.lesson2;

public class Application {
	
	public static void main(String ...args){
		Cat unnamed = new Cat();
		Cat pushok = new Cat("Pushok");
		Cat pushok1 = new Cat("Bug", 3);
		
		pushok.eat();
		pushok.sleep();
		pushok.walk();
		
		unnamed.grow(2);
		unnamed.grow(3);
		unnamed.grow(4);
		
		System.out.println("Unnamed cat`s age is equal to " + unnamed.age);
		//System.out.println("Bug`s age is equal to " + pushok1.age);
		pushok1.grow(5);
		
		pushok.setMoney(105);
		
		
		System.out.println(pushok.getMoney());
	}
}
