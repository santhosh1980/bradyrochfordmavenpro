package Tuto;

import org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig.Interface;

interface drawable{
	void draw();
}

class rectangle implements drawable{
	
	public void draw() {
		System.out.println("drawing rectangle");
	}
	
}

class circle implements drawable{
	
	public void draw() {
		System.out.println("drawing circle");
	}
	
}

public class myotherinterface{
	public static void main(String[] args) {
		
		//rectangle draw
		drawable ir=new rectangle();
		ir.draw();
		
		//circle draw
		drawable ic=new circle();
		ic.draw();
		
		
	}
}
