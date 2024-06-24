package amazonpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazonbase.Testbase;

public class Addresspage extends Testbase {
	
	@FindBy(css=".a-box.first-desktop-address-tile")
	WebElement addAdress;
	
	@FindBy (xpath="//span[@id='address-ui-widgets-countryCode']//span[@role='button']")
	WebElement countryDropdown;
	
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	WebElement fullname;
	
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	WebElement phoneno;
	
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	WebElement address;
	
	@FindBy(id="address-ui-widgets-enterAddressCity")
	WebElement city;
	
	@FindBy(css="span[id='address-ui-widgets-enterAddressStateOrRegion'] span[role='button']")
	WebElement dropdownicon;
	
	@FindBy(css="span[id='address-ui-widgets-enterAddressStateOrRegion'] span[role='button']")
	WebElement ontarioselect;
	
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	WebElement postal;
	
	@FindBy(id="address-ui-widgets-use-as-my-default")
	WebElement checkbox;
	
	@FindBy(css="a[class='a-expander-header a-declarative a-expander-inline-header a-link-expander'] span[class='a-expander-prompt'] span")
	WebElement preference;
	
	@FindBy(id="address-ui-widgets-use-as-my-default")
	WebElement addaddress;
	
	public Addresspage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void addAddressicon() {
		addAdress.click();
	}
	
	
	public void addMultiple(String fullnam, String phon, String addres, String city1, String postalcode) {
		fullname.clear();
		fullname.sendKeys(fullnam);
		phoneno.clear();
		phoneno.sendKeys(phon);
		address.clear();
		address.sendKeys(addres);
		city.clear();
		city.sendKeys(city1);
		//province.click();
		//ontarioselect.click();
		postal.clear();
		postal.sendKeys(postalcode);
		
	}
	
	public void move1 () {
		Actions action	= new Actions (driver);
		action.moveToElement(dropdownicon).build().perform();
		}
	public void Ontario() {
		ontarioselect.click();
	}
	
	public void checkboxadd() {
			checkbox.click();
	}

    public void addadressbutton() {
    	addaddress.click();
    }
    }
	
	
	
	
	
	
	
	
	


