package example;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListenerTest implements ITestListener {
  

@Override
public void onFinish(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailure(ITestResult Result) {
	// TODO Auto-generated method stub
	
	System.out.println("The name of the test case failed is:"+Result.getName());
	
}

@Override
public void onTestSkipped(ITestResult Result) {
	// TODO Auto-generated method stub
	
	System.out.println("The name of the test case skipped is:"+Result.getName());
}

@Override
public void onTestStart(ITestResult Result) {
	// TODO Auto-generated method stub
	
	System.out.println("The name of the test case started is:"+Result.getName());
}

@Override
public void onTestSuccess(ITestResult Result) {
	// TODO Auto-generated method stub
	
	System.out.println("The name of the test case success is:"+Result.getName());
}
}
