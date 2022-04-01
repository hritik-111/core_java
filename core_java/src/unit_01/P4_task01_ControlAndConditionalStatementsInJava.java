package unit_01;
/*
  #Control Statements And Conditional Statements:
 -Java provides three types of control flow statements
      -decision making statements 
           -if statement  
           -switch statement
      - loop statement
           -do-while loop
           -while loop
           -for loop
           -for-each loop 
  -Jump statement
          -break
          -continue
 * */

public class P4_task01_ControlAndConditionalStatementsInJava {
			public static void main(String args[]) {
				Statements obj = new Statements();
				
				obj.DecisionMakingStatements();
				obj.LoopStatement();
				obj.JumpStatement();
			}
	
}

class Statements{
	void DecisionMakingStatements() {
		int x = 10;
		int y = 12;
		if(x+y<10) {
			System.out.println("x+y is less than 10");
		}else {
			System.out.println("x+y is greater than 20");
		}
	
	char num = 2;
	
	//we can also use char instead of int as num here
	
	switch (num) {//
	case 0 ://case value 1:
		System.out.println("Number is 0.");
		break;
	case 1: //case value 2:
		System.out.println("Number is 1");
		break;
	default:System.out.println(num);
	}
	
 }
	void LoopStatement() {
		/*
		 * for(initialisation, condition, increment/decrement){block of statements}
		 * for{data_type var : array_name/collection_name){//statements}  
		 * */
		
		//for loop
		int sum = 0;
		for (int j = 1; j<=0 ; j++ ){
			sum =sum +j;
		}
		System.out.println("The sum of first 10 natural numbers is "+sum);
		
		//for each
		String[] names = {"Java", "C", "C++", "Python", "JavaScript" };
		System.out.println("Printing the content of the array names: \n");
		for(String name : names) {
			System.out.println(name);
		}
		/*
		 * while (condition){//looping statements}
		 * */
		int i = 0;
		System.out.println("Printing the list of first 10 even numbers \n");
		while(i<=10) {
			System.out.println(i);
			i=i+2;
		}
		
		/*
		 * do- while do {//statements} while (condition)
		 */
		i = 0;
		System.out.println("Printing the list of first 10 even numbers\n");
		do {
			System.out.println(i);
		}while(i<=10);
		
	}
	
	void JumpStatement() {
		//Break
		for (int i=0; i<=10; i++) {
			System.out.println(i);
			if(i==6) {
				break;
			}
			System.out.println(i);
		}
		
		//continue
		for (int i=0; i<=10; i++) {
			if(i==6) {
				continue;
			}
			System.out.println(i);
		}
	}
	
}
