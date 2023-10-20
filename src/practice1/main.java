package practice1;
import java.util.Scanner;

public class main {

	public static void main(String[] args)
	{
		System.out.println("1.addition");
		System.out.println("2.substractiion");
		System.out.println("3.multiplicatioin");
		System.out.println("select 1");
		
		a r =new a();
		Scanner scc=new Scanner(System.in);
		int c;
		c=scc.nextInt();
		switch(c)
		{
		
		
		case 1:
			System.out.println("you selected addition");
			r.add();
			break;
		case 2:
			System.out.println("you selected substction");
			r.diff();
			break;
		case 3:
			System.out.println("you selected multiplicatioin");
			r.mul();
			break;
		 
			
		//r.add();
		}
		
	}
}
	class a
	{
		int a,b,sum,diff;
		
	
		 void add()
		{
			 this.a=a;
			 this.b=b;
			 this.sum=sum;
			 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("eneter any intiger number");
		a=sc.nextInt();
		System.out.println("eneter another intiger number");
		b=sc.nextInt();
		sum=a+b;
		System.out.println("the sum of a and b is "+" " +sum);
		}
		 void diff()
		 {
			 
			 int d,s;
			 int diff;
		
				Scanner sc=new Scanner(System.in);
				System.out.println("eneter any intiger number");
				
			 d=sc.nextInt();
				System.out.println("eneter another intiger number");
				s=sc.nextInt();

			 System.out.println("the diff of a and b is"+ " "   + (d-s));
			 
			 
		 }
		 void mul()
		 {
			 
			 int d,s;
			 int diff;
		
				Scanner sc=new Scanner(System.in);
				System.out.println("eneter any intiger number");
				
			 d=sc.nextInt();
				System.out.println("eneter another intiger number");
				s=sc.nextInt();

			 System.out.println("the diff of a and b is"+ " "   + (d*s));
			 
			 
		 }
	
		
		
	

}
