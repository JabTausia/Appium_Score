package tests;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeTest
	public void setup() {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(null, false);
		
	}
	
	@AfterTest
	public void tearDown() {
		
	}

}
