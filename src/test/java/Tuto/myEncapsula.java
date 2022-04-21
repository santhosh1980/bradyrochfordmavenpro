package Tuto;

class Person{
	
	private String myname;
	
	//get
	public String getname() {
		
		return myname;
	}
	
	
	//set
	public void setname(String nam1) {
		
		this.myname=nam1;
	}
}
public class myEncapsula {
	
	
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.setname("willson");
		
		System.out.println(p1.getname());
	}
}
