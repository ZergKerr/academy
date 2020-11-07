package by.academy.homework0.cats;

public class Cat {
	public int age;
	public String nickname;
	double money;
	public String initials;
	boolean homeAnimal;

	public Cat() {

	}

	public Cat(String nickname) {
		this.nickname = nickname;
	}

	public Cat(String nickname, int age) {
		this.nickname = nickname;
		this.age = age;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getMoney() {
		return money;
	}

	public void grow(int addAge) {
		System.out.println("Кот вырос на " + addAge + " года");
		age = age + addAge;
	}

	public void sleep() {
		System.out.println(this.nickname + " sleeping");
	}

	public void eat() {
		System.out.println(this.nickname + " eating");
	}

	public void walk() {
		System.out.println(this.nickname + " walking");
	}

	public int getAge() {
		return age;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}
	
	public String getInitials()	{
		return initials;
	}

	public void setIsHomeAnimal(boolean homeAnimal) {
		this.homeAnimal = homeAnimal;
	}
	
	public boolean getIsHomeAnimal()	{
		return homeAnimal;
	}
}
