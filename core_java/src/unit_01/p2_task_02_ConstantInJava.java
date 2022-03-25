package unit_01;

public class p2_task_02_ConstantInJava {
	public static final double Pi = 3.14;	
	public static void main(String[] args) {
			System.out.println(Pi);
			main("Hello World");
			
			NewClass obj = new NewClass();
			obj.add(1,2);
			System.out.println(obj.Pi);
		}
	public static void main(String args) {
		System.out.println(Pi);
	}
	
	void add (int a, int b) {
		System.out.println(a+b);
		System.out.println(Pi);
	}
}

class NewClass{
	//final double Pi = 3.14;
	
	void add(int a,int b) {
		System.out.println(a+b);
		System.out.println(p2_task_02_ConstantInJava.Pi);
	}
}
