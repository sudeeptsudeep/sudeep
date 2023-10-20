import java.util.Scanner;
public class add {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the value of a");
		a=sc.nextInt();
		System.out.println("eneter the value of b");

		b=sc.nextInt();
		int sum=a+b;
		System.out.println("the sum of a and b is "+sum);

	}

}
