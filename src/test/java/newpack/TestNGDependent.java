package newpack;

import org.testng.annotations.Test;

public class TestNGDependent {
  @Test(groups= {"Browser"})
  public void a() {
	  
	  System.out.println("Open Browser");
  }
  
  @Test(dependsOnMethods= {"a"},dependsOnGroups= {"Browser"})
  public void b() {
	  
	  System.out.println("Login");
  }
  
  @Test(dependsOnMethods= {"a","b"},dependsOnGroups= {"Browser"})
  public void c() {
	  
	  System.out.println("Search Item");
  }
  
  @Test(dependsOnMethods= {"a","b","c"},dependsOnGroups= {"Browser"})
  public void d() {
	  
	  System.out.println("Add Item to Cart");
  }
  
  @Test(dependsOnMethods= {"a","b","c","d"},dependsOnGroups= {"Browser"})
  public void e() {
	  
	  System.out.println("Payment confirm");
  }
  
  @Test(dependsOnMethods= {"a","b","c","d","e"},dependsOnGroups= {"Browser"})
  public void f() {
	  
	  System.out.println("Order accept");
  }
}
