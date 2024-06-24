package amazontest;

import javax.swing.text.Utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonbase.Testbase;
import amazonpage.Homepage;
import amazonpage.LoginPage;
import amazonpage.Orderpage;

public class Ordertest extends Testbase {
	  
	Utilities utilities; 
	LoginPage loginpage;
	 Homepage homepage;
	 Orderpage orderpage;
	@BeforeMethod
	
	public void setup() {
		initiation();
	
	 utilities = new Utilities();
     loginpage = new LoginPage();
     loginpage.enteremail(prop.getProperty("username"));
     loginpage.enterpassword(prop.getProperty("password"));
     homepage = new Homepage();
     homepage.move();
     orderpage = new Orderpage();
    orderpage = homepage.yourOrder();
     
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
	@Test (priority= 1)
	
	public void buyagaincheck() {
		orderpage.BuyAgainProduct();
	}
	
	/*@Test 
	public void notyetshippedcheck() {
		orderpage.NotYetShipped();
	}
	
	@Test (priority= 3)
	
	public void cancelledordercheck() {
		orderpage.CancelledOrder();
	}*/
    }
	
	

		
		
		
		
		
	
	

	
	
	
	
	


