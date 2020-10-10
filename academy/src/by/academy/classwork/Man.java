package by.academy.classwork;

public class Man {

	
	public String name;
	public int counter = 0;
	
	public Man(String name)	{
		this.name = name;
	}
	
	public void run(int distance) {
		System.out.println("run, " + name + ", run " + distance + "m");
	}	
	
	public void addCounter()	{
		counter = counter + 1;
	}
}
