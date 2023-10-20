package practice;

public class Student
{


	String name;
	int roll;
	static String college=" goverment engineereing college krpet";
  
	

	public Student(String name, int roll)
	{
		this.name=name;
		this.roll=roll;
		System.out.println(name+" " +roll + "  "+ college);
		
			}



	public static void main(String[] args) 
	{
		Student a=new Student("sudeep",26);
		Student h=new Student("sandeep",261);
		Student j=new Student("sanjay",263);


		

	}

}
