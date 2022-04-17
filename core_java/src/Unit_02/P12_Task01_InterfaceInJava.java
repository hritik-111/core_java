package Unit_02;
/*
- An interface is a completely(100%) "Abstract class",
- that is used to group related methods with empty methods

- Need of interface?
- multiple interface can be implemented at the same time in one class?

-can an interface extend another interface?

 * */

//interface (100% Abstract class)
interface Animal{
	public void animalsound ();
	public void run();			//interface method (does not have a body)
}

//interface
interface Human{
	public void humanSound();
	public void run1();			//interface method (does not have a body)
}


public class P12_Task01_InterfaceInJava implements Animal {
		
	public static void main(String args []) {
		C1 obj = new C1();
		obj.funcA();
		obj.funcB();
	}

	@Override
	public void animalsound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
//Multiple inheritance can be implemented at the same time!
class Species implements Animal, Human{

	@Override
	public void humanSound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void animalsound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

interface A1{
	void funcA();
}

interface B1 extends A1{
	void funcB();
}

class C1 implements B1{
	public void funcA() {
		System.out.println("This is funcA form A1");
	}
	
	public void funcB() {
		System.out.println("This is funcB from A2");
	}
	
}
