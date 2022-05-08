package Assignment_01;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    String name;
		int age;
		String sec;
		int percentage;
		student arr[]=new student[6];
       
		for(int i=0;i<6;i++)
		{
			System.out.println("Enter name, age, section, percentage\n");
			 name=input.nextLine();
			 age=input.nextInt();
			 input.nextLine();
			 sec=input.nextLine();
			 percentage=input.nextInt();
			 input.nextLine();
			 arr[i]=new student(name,age,sec,percentage);
		}

		double average = 0;
	for(int i=0; i<6;i++) {
		average = average + arr[i].percentage;
	}
	 
	 System.out.println("The average is: "+average/6);
	 input.close();
	}
	
	
}
class student
{
	String name;
	int age;
	String sec;
	int percentage;
	student(String s, int a, String b,int per )
	{
		name=s;
		age=a;
		sec=b;
		percentage=per;
	}
}