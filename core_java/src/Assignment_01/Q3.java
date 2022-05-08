package Assignment_01;
//import the scanner class to take input from the user
import java.util.Scanner;
public class Q3 {
	public static void main(String []args) {
		System.out.println("Enter a number: ");
		
		Scanner input = new Scanner(System.in);		//declare object for scanner class
		int p = input.nextInt();
		
		
		//make object for test class
		In1 obj = new testclass();
		obj.display(p);
		input.close();
	}
}
//interface to implement display function later
interface In1{
	void display(int p) ;		
}

class testclass implements In1{
	int flag = 0;
	@Override
	
	public void display(int p) {
		//function to check whether the given number is prime or not.
	
		for ( int i = 2; i<=Math.pow(p, 0.5);i++ ) {  //under will help us to reduce the number of iterations
			if(p%i==0) {			//if the number is completely divisible by the number then flag will be greater than 0
				flag++;
				break;
			}
			else 				//if above condition is not fulfilled  then continue.
				continue;
		}
		if (flag == 1) {
			System.out.println("The number is not prime.");//if flag is greater than 0 the number is not prime 
		}
		else
			System.out.println("The number is prime.");//if flag is 0 the number is prime
		
	}
	
}