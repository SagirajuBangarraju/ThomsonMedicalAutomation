package testNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Day3 {
	 @Parameters({"URL","username"})
	 @Test(dataProvider="getData")
	 public void WebLoginCarloan(String urlname,String key)
	 {
		 //Selenium
		 System.out.println("WebLoginCar");
		 System.out.println(urlname);
		 System.out.println(key);
	 }
	 @Test	
	 public void MobileLoginCarloan()
	 {
		//Appium
		 System.out.println("MobileLoginCar");
	 }
	 @Test
	 public void LaptopLoginBikeLoan()
	 {
		 System.out.println("LaptopLoginBike");
	 }
	 @Test(dependsOnMethods= {"LaptopLoginBikeLoan"})
	 public void APIloginCarloan()
	 {
		//Rest API Automation
		 System.out.println("APIloginCar");
	 }
	 @DataProvider
	 public Object[][] getData()
	 {
		 // 1st combination - username password - good credit history
		 // 2nd combination -username password - no credit history
		 // 3rd combination - Fraudelent credit history	
		 Object[][] data = new Object[3][2];
		 // 1st set
		 data[0][0]="firstsetusername";				 
		 data[0][1]="firstsetpassword";
		 // 2nd set
		 data[1][0]="secondsetusername";
		 data[1][1]="secondsetpassword";
		 // 3rd set
		 data[2][0]="thirdsetusername";		 
		 data[2][1]="thirdsetpassword";
		 return data;		 
	 }
}