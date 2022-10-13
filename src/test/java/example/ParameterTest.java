package example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParameterTest {
	
  @Test
  @Parameters({"value1","value2"})

  public void sum(int val1, int val2) {
	  
	  int sum = val1+val2;
	  System.out.println("The sum is:"+sum);
  }
  
  @Test
  @Parameters({"value1","value2"})
  public void diff(int val1, int val2) {
	  
	  int diff = val1-val2;
	  System.out.println("The difference is:"+diff);
  }
  
  @Test
  @Parameters({"value1","value2"})
  public void mul(int val1, int val2) {
	  
	  int mul = val1*val2;
	  System.out.println("The multiplication is:"+mul);
  }
}
