package unit_03;
import java.util.*;


public class P14_ExceptionHandling {
	public static void main(String []args) {
		exception obj = new exception();
		//obj.basicException();
		//obj.handleException() ;
		//obj.multipleCatch();
		//obj.inputMismatchExcception() ;
		//obj.stackOverflowError(4);
		//obj.indexOutOfBoundException();
		//obj.nullPointerfException();
		//obj.useofThrow();
		//obj.useofThrow_and_finally();
		//obj.checked_Unchecked();
		obj.ManualExceptionThrow();
		
	}
}

class exception{
	void basicException() {
		int b = 0;
		int a = 100/b;
		System.out.println(a);
		System.out.println("Done!!");
	}
	
	void handleException() {
		try {
			int b = 0;
			int a = 100/b;
			System.out.println(a);
			System.out.println("Done!!");
		}catch(ArithmeticException d) {
			System.out.println(d.getMessage());
			System.out.println("Done");
		}
	}
	
	void multipleCatch() {
		try {
			int b = 0;
			int a = 100/b;
			System.out.println(a);
			System.out.println("Done!!");
		}
		catch(ArithmeticException d) {
			System.out.println(d.getMessage());
			System.out.println("Done?????");
		}
		catch(Exception e) {                
			System.out.println(e.getMessage()+ "Exception!!");
		}
	}
	
	void inputMismatchExcception() {
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the number : ");
			int number = input.nextInt();
			System.out.println("You Entered : " + number);
			
			input.close();
		}catch(InputMismatchException e){
			System.out.println(e + "Resolved");
		}
			System.out.println("Done!!");
	}
	
	void stackOverflowError(int i) {
		try {
			while(i>0) {
				i++;
				stackOverflowError(i);
			}
			//since this is an error, it can not be handled.... only exceptions can be handled with the help of try and catch blocks
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Other code execute!!");
	}
	
	void indexOutOfBoundException(){
		try {
			int [] num = {1,2,3,4};
			System.out.println(num[10]); 
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done");
	}
	
	void nullPointerfException() {
		try {
			String s = "null";
			System.out.println(s.length());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	void useofThrow(int a) throws Exception {
		if(a<18) {
			throw new Exception();
		}
		else {
			System.out.println("This Number is allowed.");
		}
	}
	
	void useofThrow_and_finally() {
		try {
			useofThrow(17);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			System.out.println("This will definitely run.");
		}
	}
	
	void checked_Unchecked() {
		/*
		 unchecked exception : Run time catching - Here we are dividing by 0- which
		  						- will not be caught at compile time - as there is no mistake but caught at
		  						- runtime because it is mathematically incorrect 
		 * */
		int x = 0;
		int y = 0;
		int z = y/x;
		System.out.println(z);
		//Checked exception [Run this code over terminal and check compiler error]
	
		try {
			useofThrow(19);
		}catch(Exception e) {
			e.getMessage();
		}
		}
	void ManualExceptionThrow() {
		try {
			//Have to use try and catch here!
			calculateArea(-1);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
		void calculateArea(int r) throws ManualException{
			if(r<0) {
				throw new ManualException();
			}
			int area = r*r;
			System.out.println(area);
		}
	
	
	}
	

	@SuppressWarnings("serial")
	class ManualException extends Exception{
		public String getMessage() {
			String detailMessage = "Exception Occured";
			return detailMessage;
		}
		
	}

