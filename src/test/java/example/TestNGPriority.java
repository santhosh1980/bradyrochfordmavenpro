package example;

import org.testng.annotations.Test;

public class TestNGPriority {
	
  @Test(priority=1)
  public void a_method() {
	  System.out.println("Priority 1 A Method");
  }
  
  @Test(priority=1)
  public void b_method() {
	  System.out.println("Priority 1 B Method");
  }
  
  @Test
  public void c_method() {
	  System.out.println("C Method");
  }
  
  @Test
  public void d_method() {
	  System.out.println("D Method");
  }
}
