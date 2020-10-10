package by.academy.classwork.lesson1;

public class Cat {
	public int age;
	public String nickname;
	
	public Cat(){
		
	}

	public Cat(String nickname){
	this.nickname = nickname;
	}
	public Cat(String nickname, int age){
		this.nickname = nickname;
		this.age = age;
		}
//	Данная запись позволяет забирать из основного класса значение переменной и добавлять к имеющемуся
	public void grow(int addAge){
		System.out.println("Кот вырос на " + addAge + " года");
		age = age + addAge;
		}
	
	public void sleep(){
		System.out.println(this.nickname + " sleeping");
		}
	
	public void eat(){
		System.out.println(this.nickname + " eating");
		}
	
	public void walk(){
		System.out.println(this.nickname + " walking");
		}
}
