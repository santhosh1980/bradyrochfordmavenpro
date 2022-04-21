package Tuto;

//abstract class
abstract class car{
	
	public int weight=6790;
	public int height=163;
	//abstract method, does not have body
	public abstract void speed(); 
	//normal method
	public void add() {
		int sum = weight + height;
		System.out.println("Addition is:" +sum);
	}
}

//subclass
class maruthi extends car{
	
	public int width=12;
	
	
	


	@Override
	public void speed() {
		System.out.println("car riding all day");
		
	}
	
}
public class myAbstract {
	
	
	
	public static void main(String[] args) {
		
		maruthi obj1 = new maruthi();
		System.out.println(obj1.weight);
		System.out.println(obj1.height);
		System.out.println(obj1.width);
		obj1.speed();
		obj1.add();
	}
}
