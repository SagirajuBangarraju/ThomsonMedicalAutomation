package testNG;
import org.testng.annotations.Test;
public class TestParallelOne {
	@Test
	public void testCaseOne() {
		//Printing Id of the thread on using which test method got executed
		System.out.println("Test Case One with Thread Id:- "+ Thread.currentThread().getName());
		System.out.println("Test Case One with Thread Id:- "+ Thread.currentThread().getPriority());
		System.out.println("Test Case One with Thread Id:- "+ Thread.currentThread().toString());
	}
	@Test
	public void testCaseTwo() {
		////Printing Id of the thread on using which test method got executed
		System.out.println("Test Case two with Thread Id:- "+ Thread.currentThread().getId());
	}
}