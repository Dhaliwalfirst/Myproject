package amazonpage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazonbase.Testbase;

public class SearchingPage extends Testbase {
	
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBar;
	
	@FindBy(css = "[class='s-suggestion-container']")
	List<WebElement> searchSuggestions;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchBtn; 
	
	@FindBy(xpath = "(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
	WebElement prodText;
	
	
	@FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal']")
	List<WebElement> prodList;

	@FindBy(xpath = "//th[contains(text(),'ASIN')]//following-sibling::td")
	WebElement asinText;
	

	public SearchingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean searchByPartialText(String prodName) {
		searchBar.clear();
		searchBar.sendKeys(prodName);
		int i = 0;
		boolean plan;
		for (WebElement e : searchSuggestions) {
			String txt = e.getText();
			if (txt.contains(prodName)) {
				i++;
			}

		}
		if (i == 10) {
			plan = true;
		} else {
			plan = false;
		}
		return plan;

	}

	public String searchDescriptionTxt(String productDes) {
		searchBar.clear();
		searchBar.sendKeys(productDes);
		searchBtn.click();
		return prodText.getText();

	}
	
	public void clickOnProductToBuy() {
		prodText.click();
	}
	
	public boolean searchByKeyword(String keyword) {
		searchBar.clear();
		searchBar.sendKeys(keyword);
		searchBtn.click();
		boolean plan = false;
		int i = 0;

		for (WebElement ele : prodList) {
			String txt = ele.getText();
			System.out.println(txt);
			if (txt.contains(keyword))
				i++;

		}
		System.out.println(i);
		if (i >= 30) {
			plan = true;
		} else {
			plan = false;
		}

		return plan;
	}
}
	
	
	
	
	
	
	
	
	
