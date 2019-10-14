package testNG;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
// ITestListener is an interface which implements TestNG listeners
public class Listeners implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("I Successfully Executed listeners pass code");
	}

	@Override
	public void onTestFailure(ITestResult result) {
	System.out.println("I Failed to Executing listeners pass code");	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
