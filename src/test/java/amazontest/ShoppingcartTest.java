package amazontest;

import javax.swing.text.Utilities;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonbase.Testbase;
import amazonpage.Homepage;
import amazonpage.LoginPage;
import amazonpage.PlaceorderPage;
import amazonpage.ProductCheckoutPage;
import amazonpage.ProductinfoPage;
import amazonpage.SearchingPage;
import amazonpage.ShoppingcartPage;
import dev.failsafe.internal.util.Assert;

public class ShoppingcartTest extends Testbase {
	Utilities utilities;
	LoginPage loginpage;
	Homepage homepage;
	ShoppingcartPage shoppingcartPage;
	SearchingPage searchingpage;
	ProductCheckoutPage  prdtcheck;
	ProductinfoPage  prdtinfo;
	PlaceorderPage placeorders ;
	@BeforeMethod
	
	public void setup() {
		initiation();
		 homepage =new Homepage();
		 utilities = new Utilities();
		 loginpage = new LoginPage();
		 loginpage.enteremail(prop.getProperty("username"));
		 loginpage.enterpassword(prop.getProperty("password"));
		 shoppingcartPage= new ShoppingcartPage();
		 searchingpage=new SearchingPage();
		  prdtinfo = new ProductinfoPage();
		 prdtcheck = new ProductCheckoutPage();
		  placeorders = new PlaceorderPage ();

		  
		}
	
	/*@Test
	public void verifyingProductInfo()  {
		String prodText=searchingpage.searchDescriptionTxt(prop.getProperty("description"));

		searchingpage.clickOnProductToBuy();
		prdtinfo.addtoCartBtn();
        prdtcheck.Gotocart();
		String prodNameinCart=shoppingcartPage.getProductName();
		System.out.println(prodText);
		System.out.println(prodNameinCart);
		//Assert.assertTrue(prodText.contains(prodNameinCart.split("14")[0]));
	}
	
	@Test
	public void verifyingTotalPriceInCart() {
		searchingpage.searchDescriptionTxt(prop.getProperty("keyword"));
		searchingpage.clickOnProductToBuy();
		prdtinfo.addtoCartBtn();
		prdtinfo.notanksbtn();
        prdtcheck.Gotocart();
        shoppingcartPage.selectingQuantity();
		//Assert.assertTrue(shoppingcartPage.verifyingPrice());
	}*/
	
	@Test
	public void laststep() {
		searchingpage.searchDescriptionTxt(prop.getProperty("keyword"));
		searchingpage.clickOnProductToBuy();
		prdtinfo.addtoCartBtn();
		prdtinfo.notanksbtn();
        prdtcheck.Gotocart();
        shoppingcartPage.selectingQuantity();
        placeorders.clickOnPlaceOrder();
        
	}
}    
	
	
	
	
