package amazontest;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonbase.Testbase;
import amazonpage.Accountpage;
import amazonpage.Addresspage;
import amazonpage.Homepage;
import amazonpage.LoginPage;
import util.Utilities;

public class AddressTest extends Testbase{
	     
	    Utilities utilities;
	    LoginPage loginpage;
	    Homepage homepage;
	    Addresspage addresspage;
	    Accountpage accountpage;
	public AddressTest() {
		super();
	}
	
	@BeforeMethod
	
	public void firststep() {
		initiation();
		
		utilities = new Utilities();
		loginpage = new LoginPage();
	    homepage = new Homepage();
	  accountpage = new Accountpage();
	    addresspage = new Addresspage();
		loginpage.enteremail(prop.getProperty("username"));
		loginpage.enterpassword(prop.getProperty("password"));
		homepage.move();
		homepage.yourAccount();
		accountpage.yourAddressicon();
		addresspage.addAddressicon();
		
	}
		
	@Test (priority=1)
	
	public void firststepaddress() {
		addresspage.addMultiple(prop.getProperty("fullname"),prop.getProperty("phone"),prop.getProperty("address"),prop.getProperty("city"),prop.getProperty("postal"));
	}
	
	@Test (priority=2)
	public void On() {
		addresspage.move1();
		addresspage.Ontario();
	//	addresspage.checkboxadd();
		addresspage.addadressbutton();
    }
	
 @Test (priority=3)
    
	public void addaddressbuttonclick() {
		addresspage.addadressbutton();
    }
    }
	
	
	
	
	
	
	
	
	


