class Music
{
	int a=10;
	static void song()
	{
		System.err.println( " play song....");
	}
	void hotsong()
	{
		System.err.println(" hot song play...");
	}
	static
	{
		System.err.println("hii");
	}
}
class video
{
	void oldfilms()
	{
		System.err.println(" old film play... ");
	}
	void newfilms()
	{
		System.err.println(" new film play... ");
	}
}

public class Calculator {


	public static void main(String[] args) {
		
		Music ref =new Music();
		Music ref1 =new Music();
	    System.err.println(ref.a);
		System.err.println(ref+ " "+ ref1);
		ref1.song();
		ref.hotsong();
		Music.song();
		


	}

}
