package chapter3;

//import ObjClass;

public class Chap3 {
	
	public Chap3() {
	}
	
	public static void main(String[] args){

		/*chX();*/
		ch3_strings();
	}
	
	/** */
	protected static void chX(){	
		System.out.println("something");
	}
		
	/** */
	protected static void ch3_strings(){	
		
		String string = "animals";
		
		System.out.println("charAt() : " + string.charAt(0)); 
		System.out.println("charAt() : " + string.charAt(6));
		//System.out.println(string.charAt(7));
		
		
	}
	
	protected static void ch4_strings(){	
		String string = "animals";
		System.out.println("charAt() : " + string.charAt(0)); 
	}
}