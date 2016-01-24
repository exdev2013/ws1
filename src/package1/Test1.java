package package1;

//import ObjClass;

public class Test1 {
	
	public Test1() {
	}
	
	public static void main(String[] args){
		
		/*stuff();*/	
		/*ch2BinaryOperators();*/
		/*ch2AssignmentOperators();*/	
		/*ch2LogicalOperators();*/
		/*ch2EqualityOperators();*/
		/*ch2TernaryOperator();*/
		/*ch2SwitchStatement();*/
		/*ch2WhileLoop();*/
		/*ch2DoWhileLoop();*/
		/*ch2ForStatement();*/
		ch2ForEach();
		ch2BreakLoop();
	}
	
	/** */
	/** */
	protected static void chX(){	
		System.out.println("something");			
	}
	
	/** */
	/** */
	protected static void ch2BreakLoop(){	
		System.out.println("-- Break Loop --");
		
		int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		
		PARENT_LOOP: for(int i = 0; 1 < list.length; i++){
			
			for (int j = 0; j < list[i].length; j++){
				if(list[i][j]==searchValue){
					positionX = i;
					positionY = j;
					break PARENT_LOOP;
				}
			}
		}
		
		if(positionX == -1 || positionY == -1){
			System.out.println("Value " + searchValue + " not found");
			
		}else{
			System.out.println("Value " + searchValue + " found at: " + "(" + positionX + ", " + positionY + ")");
		}
		
	}
	
	
	/** Testing */
	protected static void ch2ForEach(){	
		System.out.println("-- For-each loop --");	
		
		System.out.println();
		System.out.println("** Array **");
		final String[] names = new String[3];
		names[0]="Lisa";
		names[1]="Kevin";
		names[2]="Rogers";
		
		for(String name : names) {
			System.out.println(name + ", ");
		}
		
		System.out.println();
		System.out.println("** List **");
		java.util.List<String> values = new java.util.ArrayList<String>();
		values.add("Lisa");
		values.add("Kevin");
		values.add("Roger");
		
		for(String value : values){
			System.out.println(value + ", ");
		}
		
/*		System.out.println();
		System.out.println("** Multi-dimensional array **");
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		
		for(int[] mySimpleArray : myComplexArray){
			for(int i=0 ; i < mySimpleArray.length ; i++){
				System.out.println(mySimpleArray[i] + "\t");
			}
			System.out.println();
		}*/
		
		System.out.println();
		System.out.println("** Nested loops **");
		int x = 20;
		while(x > 0){
			do{
				x -= 2;
			} while (x > 5);
			
			x--;
			System.out.print(x + "\t");
		}
		
		System.out.println();
		System.out.println("** Optional Labels **");
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		
		OUTER_LOOP: for(int[] mySimpleArray : myComplexArray){
			INNER_LOOP : for(int i=0; i < mySimpleArray.length; i++) {
				System.out.print(mySimpleArray[i] + "\t");
			}
		System.out.println();
		}
	}
	
	/** */
	protected static void ch2ForStatement(){	
		System.out.println("-- For statement --");	
		System.out.println("for(initialization; booleanExpression; updateStatement){ --");	
		System.out.println("//body");
		System.out.println("}");
		
		for(int i = 0; i < 10; i++){
			System.out.print(i + " ");
		}
		
		System.out.println("1. Infinite loop");
		/*for(;;){
			System.out.println("Hello World");
		}*/
		
		System.out.println("2. adding multiple terms to the for statement");
		int x = 0;
		for(long y = 0, z = 4; x < 5 && y < 10; x++, y++){
			System.out.print(y + " ");
		}
		System.out.println(x);
		
		System.out.println("3. adding multiple terms to the for statement");
		
	}
	/** */
	protected static void ch2DoWhileLoop(){	
		System.out.println("Do While Loop");	
		
		int x = 0;
		
		do {
			x++;
		} while (false);
		System.out.println(x);	//outputs 1
		
		/* both statements below are the same */
		x=0;
		while (x > 10){
			x--;
		}
		System.out.println(x);
		
		x=0;
		if(x > 10){
			do{
				x--;
			} while(x > 10);
		}
		System.out.println(x);
	}
	
	/** */
	protected static void ch2WhileLoop(){	
		System.out.println("-- While Loop --");	
		
		int roomInBelly = 5;
		int bitesOfCheese = 6;
		
		while(bitesOfCheese > 0 && roomInBelly > 0){
			bitesOfCheese--;
			roomInBelly--;
		}
		System.out.println(bitesOfCheese + " pieces of cheese left");
	}
	
	/** */
	protected static void ch2SwitchStatement(){	
		System.out.println("-- Switch Statement --");	
		
		int dayOfWeek = 5;
		
		switch(dayOfWeek){
		default:
			System.out.println("Weekday");
			break;
		case 0:
			System.out.println("Sunday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}
		
		int x = getSortOrder("Donald", "Duck");
	}
	
	private static int getSortOrder(String firstName, final String lastName) {
		String middleName = "Patricia";
		final String suffix = "JR";
		int id = 0;
		
		switch(firstName){
			case "Test":
				return 52;
/*			case middleName:   //Does not compile. case expression must be constant expressions
				id=5;
				break;*/
			case suffix:
				id=0;
				break;
/*			case lastName: //Does not compile. case expression must be constant expressions. because it is passed into function.
				id=8;
				break;*/
/*			case 5:  //Does not compile. Cannot convert from int to String
				id=7;
				break;*/
/*			case 'J': //Does not compile. Cannot convert from Char to String
				id=10;
				break;*/
/*			case java.time.DayOdWeek.SUNDAY: //Does not compile
				id=15;
				break;*/
		}
		return id;
		
	}

	/** The conditional operator, ? :, otherwise known
	 * as the ternary operator, takes three operands.
	 * i.e. booleanExpression ? expression1 : expression2 */
	protected static void ch2TernaryOperator(){	
		System.out.println("-- Ternary Operator --");
		
		int y=1;
		int z=1;
		
		//expression is true so only y is incremented
		final int x=y<10 ? y++ : z++;
		System.out.println(y + "," + z + "," + x );	//outputs 2,1,1		
		
		//expression is false so only z is incremented
		y=1;
		z=1;
		final int s=y>=10 ? y++ : z++;
		System.out.println(y + "," + z + "," + s );	//outputs 1,1,1		
	}
	
	
	/** Chap2 : Increment and Decrement operators */
	protected static void ch2IncDecOperators(){	
/*		Increment and Decrement operators
		order of precedence 
		(++x=4) * 5 / (x=4)(x--=3) + (--3=2)
		4*5 / 4 + 2 = 7 */
		int x =3;
		int y = ++x *5 / x-- + --x; 
		System.out.println("x is " + x);
		System.out.println("y is " + y);			
	}
	
	/** Chap2 : Binary Operators */
	protected static void ch2BinaryOperators(){	
		/* Assigment Operator is a binary operator that assigns, 
		 * the variable on the left-hand side of the operator
		 * with the results of the value on the right-hand side 
		 * of the equation */
		//int x=1;
		
		/* Casting primitive values */
		int x = (int)1.0;
		short y = (short)1921222; //stored as 20678 - overflow
		int z = (int)9L;
		long t = 192301398193810323L;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(t);
		
		/*Since 2147483647 is the maximum in value, adding any 
		 * strictly positive value to it will cause it to wrap 
		 * to the next negative number*/
		System.out.println(2147483647+1); //-2147483647 - underflow
		
	}
	
	/** Chap2  Logical Operators */
	protected static void ch2LogicalOperators(){
		
		ObjClass objx = new ObjClass();
		
		objx.setValue(4);
		
		if(objx !=null && objx.getValue() < 5) {
			System.out.println(objx.getValue());
		}
		
		objx=null;
		if(objx !=null && objx.getValue() < 5) {
			System.out.println(objx.getValue());
		}
		
		if(objx !=null & objx.getValue() < 5) {  // null pointer exception
			System.out.println(objx.getValue());
		}
		
	}
	
	/** Chap2 : Equality Operators */
	protected static void ch2EqualityOperators(){	
		
		//int x=1; //does not compile
		boolean x=true;
		
		if(x) {
			System.out.println("something");	
		}
	}
	
	protected static void ch2AssignmentOperators(){	
		short a=10;
		short b=3;
		short c= (short)(a*b); //explicit cast result
		
		/*Compound assigment operator*/
		int x =2, z =3;
		x = x*z; //Simple assignment operator
		x *= z; //compound assignment operator			
	}
	
	protected static void stuff(){
		/* Test1 t = new Test1();
		System.out.println(t.number);
		System.out.println(Integer.MAX_VALUE); */
		
		//long max = 3123456789L;
		/* System.out.println(56); //56
		System.out.println(0b11); //3
		System.out.println(017); //15
		System.out.println(0x1F); //31
		*/
		
		/*int million1 = 1000000;
		int million2 = 1_000_000;
		System.out.println(million1);
		System.out.println(million2);*/
		
	/*	java.util.Date today;
		String greeting;
		
		today = new java.util.Date();
		greeting = "How are you?";
		
		System.out.println(today);
		System.out.println(greeting); */
		
	/*	String reference = "hello";
		int len = reference.length();
		//int bad = len.length(); //Cannot invoke length() on the primitive type int
		System.out.println(len); */
		
	/*	int y=10; 
		int x;
		int reply = x + y; */
		
		/** CHAP 2 */
/*		int x=!5; //does not compile
		boolean y = -true; //does not compile
		boolean z = !0; //does not compile	
*/	

/*		int y = 5;
		boolean x=true || (y<4);
		System.out.println(x + ":" + y);	*/
		
	}
	
}