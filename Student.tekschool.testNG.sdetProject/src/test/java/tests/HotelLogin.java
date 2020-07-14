package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import core.Base;
import pageObj.HotelLoginPageObj;
import utilities.DriverUtility;

public class HotelLogin extends Base {
	HotelLoginPageObj hotelpageObj;

	@BeforeMethod
	public void beforeMethod() {
		Base.initializeDriver();
		logger.info("Browser opened successfully");

	}

	@Test (enabled =false) // TestNG will skip this test case
	public void loginToHotelPage() {
		hotelpageObj = new HotelLoginPageObj();
		hotelpageObj.clickonSignIn();
		logger.info("user clicked on Sign in");
		hotelpageObj.enterEmail(getUserName());
		logger.info("user entered email address");
		hotelpageObj.enterPassword(getPassword());
		logger.info("user entered password");
		hotelpageObj.clickonSignInButton();
		logger.info("user clicked on sign in button");
		DriverUtility.wait(5000);
		DriverUtility.screenShot();

	}
	@Test (priority = 1)
	@Parameters({"userName","password"})
	public void liginWithParameter(String userName, String password) {
		
		hotelpageObj = new HotelLoginPageObj();
		hotelpageObj.clickonSignIn();
		logger.info("user clicked on Sign in");
		hotelpageObj.enterEmail(userName);
		logger.info("user entered email address from parameters");
		hotelpageObj.enterPassword(password);
		logger.info("user entered password from parameters");
		hotelpageObj.clickonSignInButton();
		logger.info("user clicked on sign in button");
		DriverUtility.wait(5000);
		DriverUtility.screenShot();
		
	}
	
	@Test (priority = 4, enabled = false)
	public void testThree() {
		logger.info("this is just sample");
	}
	
	@Test
	@Ignore
	public void testFour() {
		logger.info("this is just Example");
	}
	


	@AfterMethod
	public void afterMethod() {
		Base.tearDown();
		logger.info("Browser closed");

	}

}
