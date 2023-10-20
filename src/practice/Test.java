package practice;
class Test
{
	

	public static void main(String[] args) {
		
		 a= {40,20,5,10};
		int max=a[3],min=0;
		System.out.println("the maximum of given arry is");
		for(int i=0;i<a.length;i++)
		{ 
			
			if(a[i]>max)
			{
				max=a[i];
				
			}else
			{
				min=a[i];	
			}
			
		}
		System.out.println(max);
		System.out.println("the minimum of given arry is");
		System.out.println(min);
	}

}
