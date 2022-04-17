package Unit_02;
/*
Abstract Class:
- An abstract class must be declared with an abstract keyword.

- Abstraction is a process of hiding the implementation details and showing only functionality
		(function declaration) to the user.
- We cannot make the objects of derived class directly but through derived class[can not be instance]

- Example of abstract method?
- Abstract Class may contain abstract and non-abstract methods 
- (0-100%) abstract methods can be there!

- in case of interface: 100% abstract methods should be there!

Final Class: 
- The main purpose of declaring a class is to prevent the class from being inherited
- If a class is final then no class can inherit any feature from the final class.
- You cannot extend a final class. If you try it gives you a compile time error.
 */

abstract class Bike{
	int a;
	
	Bike (){
		System.out.println("Inside Bike Constructro: "+ a + "\n");
	}
	
	abstract void run(); //abstract method!(0-100%)
	
	void display() {
		System.out.println("This is display method!");
	}
}

class Honda4 extends Bike{

	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}
	
}

public class P09_Task01_AbstractAndFinalClassInJava {
		public static void main(String[] args) {
			Bike obj = new Honda4();
			
			//obj.run();
			obj.display();
			
			//cannot be initiated
			//Bike obj = new Bike();
		}
}

//super
final class Super{
	public int data = 30;
	
	void display() {
		System.out.println(data);
	}
}
/*
public class Sub extends Super{		-	The type Sub cannot subclass the final 
	 									class Super
	 								- 	The public type Sub must be defined in its 
	 									own file
		void display2(){			
			display();
		}
}

*/