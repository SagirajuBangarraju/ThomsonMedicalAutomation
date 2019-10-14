package testNG;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Day1 {

	 @Test
	 public void firsttest()
	 {
		 System.out.println("Hello");
		 Assert.assertTrue(true);
	 }
	 @Test
	 public void secondtest()
	 {
		 System.out.println("How are you");
	 }
	 @Test
	 public void thirdtest()
	 {
			System.out.println("Good");
	 }
}