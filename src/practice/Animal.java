package practice;

public class Animal 
{
	void eat()
	{
		System.out.println("dog can start eating after calling ");
		
	}
	void run()
	{
		System.out.println("dog can start running after calling ");
	}

	public static void main(String[] args) 
	{
		Animal dog= new Animal();
		dog.eat();
		dog.run();
		Vehicle.stop();
		Vehicle.move();
	
	}

}
class Vehicle
{
	static void stop()
	{
		System.out.println("car stop ");
	}
	static void move()
	{
		System.out.println("car move");
	}
}
