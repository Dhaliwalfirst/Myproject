package amazonpage;

import java.time.Duration;
import java.util.Timer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazonbase.Testbase;

public class LoginPage extends Testbase {
	
	@FindBy (id="ap_email")
	WebElement email;
	
	@FindBy (id="continue")
	WebElement Continue;
	
	@FindBy (id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signinbutton;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enteremail(String username) {
		email.sendKeys(username);
		Continue.click();	
	}
	
	public Homepage enterpassword(String passwrd) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		password.sendKeys(passwrd);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		signinbutton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		return new Homepage();
	}
	
    }
	
	

