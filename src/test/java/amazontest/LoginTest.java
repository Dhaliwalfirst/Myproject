package amazontest;

import java.time.Duration;

import javax.swing.text.Utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonbase.Testbase;
import amazonpage.LoginPage;

public class LoginTest extends Testbase{

	
	Utilities utilities;
	LoginPage signin;
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void first() {
		initiation();
		 signin =new LoginPage();
		utilities = new Utilities();
	}
		
	@Test
	public void Login() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		signin.enteremail(prop.getProperty("username"));
	    signin.enterpassword(prop.getProperty("password"));
		
	}
 /*	@Test(priority=2)

	public void CorrectPassword() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    signin.enterpassword(prop.getProperty("password"));	
	}

	/*@AfterMethod
	public void Close() {
		driver.close();	}*/

	
}
	
	
	
	
	
	
	
	
	
	
	
	
	

