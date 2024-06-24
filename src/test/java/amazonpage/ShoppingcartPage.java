package amazonpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import amazonbase.Testbase;
import com.amazon.util.Utilities;

public class ShoppingcartPage extends Testbase{
	
	
	@FindBy(xpath="//span[@class='a-truncate-cut']")
	WebElement prodcutname;
	
	@FindBy(css="[data-a-native-class='sc-update-quantity-select ']")
	WebElement quantityincart;
	
	@FindBy(xpath="//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")
	WebElement priceoneproduct;
	
	@FindBy(xpath="//div[@class='a-row a-spacing-mini sc-subtotal sc-subtotal-buybox sc-java-remote-feature']")
	WebElement totalprice;
	
	public ShoppingcartPage () {
		PageFactory.initElements(driver, this);
	}
	
	public String getProductName() {
		return prodcutname.getText();
	}
	

	public void selectingQuantity() {
		Utilities.selectByvalue(quantityincart, "3");
	
	}
	
	public boolean verifyingPrice() {
		String price=priceoneproduct.getText();
		System.out.println(price);
		return totalprice.isDisplayed();
	}
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	

     
     
     
     
     
     
     
     
     
     
     
     
     
     
