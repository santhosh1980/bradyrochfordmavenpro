package Tuto;

class Outerclass{
	
	int x = 10;
	
	class Innerclass{
		
		int y=15;
		
		public int Innermethod() {
			return (x);

		}
	}
	
}



public class myOuterInnerclass {
	
public static void main(String[] args) {
		
	Outerclass obj1 = new Outerclass();
	
	Outerclass.Innerclass obj2 = obj1.new Innerclass();
	
	System.out.println(obj1.x + obj2.y);
	
	System.out.println(obj2.Innermethod());
	
	}
	
}
	
	
	

