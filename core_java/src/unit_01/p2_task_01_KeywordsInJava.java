package unit_01;

public class p2_task_01_KeywordsInJava {
	public static void main(String[] args) {
	//variable name
	//Syntax error on token "double", invalid VariableDeclaratorId
	int double = 9;
	
	//function name
	int new() {
		System.out.println();
		return 0;
	}
	
	//class name[given below]
	
	//object
	/*Multiple markers at this line
	- Syntax error on token "int", delete 
	 this token
	- ABC cannot be resolved to a variable*/
	ABC int = new ABC();
	}
}

//Syntax error on token "int", Identifier expected
class int {
	void display() {
		System.out.println("Another class");
	}
}

class ABC{
	void display() {
		System.out.println("ABC class");
	}
}


