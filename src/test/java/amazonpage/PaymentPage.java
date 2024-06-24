package amazonpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import amazonbase.Testbase;

public class PaymentPage extends Testbase {
	
	@FindBy(xpath="//div[@id='pp-OUCEKv-31']//img")
	WebElement addpayment;
	
	@FindBy(css="span[id='pp-OUCEKv-39'] input[type='submit']")
	WebElement addcreditordebit;
	
	@FindBy(xpath = "//input[@name='addCreditCardNumber']")
	WebElement cardNumber;

	@FindBy(css = "[name='ppw-accountHolderName']")
	WebElement nameOnCard;

	@FindBy(css = "[name='addCreditCardVerificationNumber']")
	WebElement cvv;

	@FindBy(xpath = "(//span[@class='a-button-text a-declarative' and @role='button'])[1]")
	WebElement monthSelect;

	@FindBy(xpath = "(//span[@class='a-button-text a-declarative' and @role='button'])[2]")
	WebElement yearSelect;
	
	@FindBy(xpath = "//span[@class='a-button a-button-primary pmts-button-input']")
	WebElement addCard;
    }
	
	
	


