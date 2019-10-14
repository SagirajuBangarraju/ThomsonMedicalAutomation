package testNG;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Day4 {
	 @Test(groups="smoke")
	 public void Homeloan()
	 {
		 System.out.println("HomeLoanSanctioned");
	 }
	 @Parameters({"URL"})
	 @Test()
	 public void WebLoginHomeloan(String urlname)
	 {
		 //Selenium
		 System.out.println("WebLoginHome");
		 System.out.println(urlname);
	 }
	 @Test()
	 public void MobileLoginHomeloan()
	 {
		 //Appium
		 System.out.println("MobileLoginHome");
	 }
	 @Test(enabled=false)
	 public void APIloginHomeloan()
	 {
		 //Rest API Automation
		 System.out.println("APIloginHome");
	 }
}