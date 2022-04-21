package Tuto;

public class myStaticPublicMethod {
	
	static String mymethod(String str1, String str2) {
		System.out.println("Static methods can be called without creating objects");
		return(str1+" and "+str2);
	}
	static void mycheckage(int x) {
		if(x>=18) {
			System.out.println("You are allowed");
		}
		else if (x<18 && x>=10) {
			
			System.out.println("Sorry, you are not permitted");
		}
		else {
			
			System.out.println("Please check with parents");
		}
		
	}
	public String pub(String str1, String str2) {
		System.out.println("Public methods must be called by creating objects");
		return(str1+" and "+str2);
	}
	
	public static void main(String[] args) {
		myStaticPublicMethod obj1 = new myStaticPublicMethod();
		System.out.println(obj1.pub("hello", "word"));
		System.out.println(mymethod("Java","Python"));
		System.out.println(mymethod("Automation","Appium"));
		System.out.println(mymethod("Azure","Devops"));
		mycheckage(10);
	}
}
