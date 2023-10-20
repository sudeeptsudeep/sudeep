import java.util.Scanner;

public class Abc {
	
	void vote()
	{
		System.out.println("enter your age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("you are eligible to vote");
		}
		else
		{
			System.out.println("sorry you are too young cant vote");
		}
		
	}
	
	
	

	public static void main(String[] args) {
	
		Abc ref=new Abc();
		Scanner sc=new Scanner(System.in);
		ref.vote();
		
		
	}

}
