package Assignment_01;

public class Q4 {
		public static void main(String [] args) {
			System.out.println("Without passing the parametr: \n");
			three obj1 = new three ();
			System.out.println("\nWhen passing the parameter: \n");
			three obj2 = new three(3);
		}
}
class one {
	one(int a){
		System.out.println("Inside One");
	}
}

class two extends one{

	two() {
		super(1);
		System.out.println("Inside Two extends one");
		// TODO Auto-generated constructor stub
	}
	
}

class three extends two{
	three(){
		System.out.println("Default Constructor: three extends two");
	}
	three(int a){
		System.out.println("Inside parameterised constructor : three extends two"); 
	}
}