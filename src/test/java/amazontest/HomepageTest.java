package amazontest;

import javax.swing.text.Utilities;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonbase.Testbase;
import amazonpage.Homepage;
import amazonpage.LoginPage;

public class HomepageTest extends Testbase{
	   
	Homepage homepage;
	Utilities utilities;
	LoginPage loginpage;
	
	public HomepageTest() {
		super();
	}
	
	@BeforeMethod
	public void First() {
		initiation();
		homepage =new Homepage();
	    utilities = new Utilities();
	    loginpage = new LoginPage();
	    loginpage.enteremail(prop.getProperty("username"));
	    loginpage.enterpassword(prop.getProperty("password"));
	    
	}
	
	@Test
	public void youraccountTest() {
		homepage.move();
		homepage.yourAccount();
		
	}
	
	/*@Test
	public void yourorderTest() {
		homepage.move();
		homepage.yourOrder();
	} 
	
    @Test
	public void yourRecommendationTest() {
		homepage.move();
		homepage.yourRecommendation();
	}
	  
	@Test
	public void yourmembershipTest() {
		homepage.move();
		homepage.yourMembership(); 
	}*/
	
	/*	@Test
	public void yourgiftTest() {
		homepage.move();
		homepage.yourGift();
	} 
	
	@Test
	public void yourBabyregTest() {
		homepage.move();
		homepage.yourBabyreg();
	}*/
	
	
	
	
	
	
	
	
	

}
