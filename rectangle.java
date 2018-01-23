package class4;

public class rectangle
{
	int length;
	int breadth;
	void val(int a,int b)
	
	{
		length=a;
		breadth=b;
	}
	int Calculatearea()
	{
		return(length*breadth);
	}
	
	public static void main(String args[])
	{
	
		rectangle rect=new rectangle();
		rect.val(20,30);
		System.out.println("area of rectangle is"+rect.Calculatearea());
	}
   
   
}
