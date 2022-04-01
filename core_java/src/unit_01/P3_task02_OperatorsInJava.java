package unit_01;
/*
 * operators in java is a symbol that is used to perform operations 
 * sum=a+b;
 * 	for example: +,-,*,/
 * 	#types of operators in java
 * 		-Unary operators : {prefix and postfix}[a++,a--,++a,etc]
 * 		-Arithmatic operators: {*,-,/,+,%}
 * 		-Shift operators: {<< , >>}
 * 		-relational operators: {> < <= >= !=
 * 		-Bitwise operators : {& ^ |}
 * 		-Logical operators : {&& ||}
 * 		-ternary operators: {? : }
 * 		-Assignment operators: {=,+=,-=,/=,%=,&/,>>=,>>=}
 */

public class P3_task02_OperatorsInJava {

	public static void main(String[] args) {
		OperatorsInJava obj = new OperatorsInJava();
		
		obj.UnaryOperator();
		obj.Arithmatic();
		obj.ShiftOperator();
		obj.RelationalOperator();
		obj.BitwiseandLogicalOperators();
		obj.TernaryOperator();
		obj.AssignmentOperator();

	}

}
class OperatorsInJava
{
	void UnaryOperator() {
		int a=10;
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		
		
	}
	void Arithmatic()
	{
		int a=10,b=5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
	void ShiftOperator()
	{
		System.out.println(10<<2);
		System.out.println(10>>2);
		System.out.println("\n");
	}
	void RelationalOperator() {
		int a=10,b=5;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>=b);
		System.out.println(a<=b);
	}
	void BitwiseandLogicalOperators()
	{
		System.out.println("Inside BitwiseAndLogicalOperators");
		int a=10,b=5,c=20;
		//Logical && and bitwise &
		System.out.println(a>b && a++<c);//false && true = false
		System.out.println(a);           //10 because second condition is not checked
		
		System.out.println(a<b & a++<c);//true | true = true
		System.out.println(a);          //11 because second condition is checked 
        
		//logical || and bitwise | 
		System.out.println(a>b||a<c); //true || true = true
		System.out.println(a>b|a<c);  //true | true = true
		
		System.out.println(a>b||a++<c); //true || true = true 
		System.out.println(a);         //10 because second condition is not checked
		System.out.println(a>b|a++<c); //true | true = true 
		System.out.println(a);         //11 because second condition is checked
	
		/*
		 * Exclusive and Inclusive OR{| and ^}
		 * In case of OR : 0|1 = 1, 1|0 = 1, 1|1 = 1, 0|0 = 0
		 * In case of XOR: 0|1 = 1, 1|0 = 1, 1|1 = 0, 0|0 = 0
		 * */
		System.out.println("Bitwise inclusive OR: "+(12|12));//1100 | 1100 = 1100
		System.out.println("Bitwise exclusive OR: "+(12^12));//1100 ^ 1100 = 0000
		System.out.println("\n");
		
	}
	void TernaryOperator() {
		System.out.println("Inside Ternary Operator: \n");
		
		int a= 2, b= 5;
		int min = (a<b) ? a:b;
		System.out.println(min);
		System.out.println("\n");
	}
	void AssignmentOperator() {
		System.out.println("Inside Assignment Operator");
		
		int a = 10;
		int b = 20;
		a+=4;
		b-=4;
		System.out.println(a);
		System.out.println(b);
		
		//Exercise
		b>>>=2;
		System.out.println(b);
		
		a=10;
		a+=3;//a=13
		System.out.println(a);
		a-=4;//a=9
		System.out.println(a);
		a*=2;//a=18
		System.out.println(a);
		a/=2;//a=9
		System.out.println(a);
		
		System.out.println("\n");
	}
}