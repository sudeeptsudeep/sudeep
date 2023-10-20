package practice;

public class employ {
	int id;
	String name;
	static String companey="tcs";
	
	employ(int id ,String name)
	{
		this.id=id;
		this.name=name;
	}
	void disply()
	{
		System.out.println(id+   "      "   + name + "     " +companey);
	}
	
	
	public static void main(String[] args) {
		System.out.println("id    name    companey");
		employ e1=new employ(100,"karan");
		e1.disply();
		employ e2=new employ(100,"karan");
		e2.disply();
		
		
			

	}

}
