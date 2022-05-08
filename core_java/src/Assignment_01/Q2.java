package Assignment_01;

public class Q2 {
	public static void main(String []args) {
		ABC c1=new ABC();
		ABC c2=new ABC();
		ABC c3=new ABC();
		c1.display();
		c2.display();
		c3.display();
		c1.display();
		 System.out.println("The count is:"+ABC.count);
	}
}

class ABC
{
	static int  count=0;
	
	void display()
	{
		System.out.println("Calling the member function");
		count++;
	}
	
}