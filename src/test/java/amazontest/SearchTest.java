package amazontest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonbase.Testbase;
import amazonpage.Homepage;
import amazonpage.LoginPage;
import amazonpage.SearchingPage;
import util.Utilities;

public class SearchTest extends Testbase{
	
	Utilities utilities;
    LoginPage loginpage;
    Homepage homepage;
    SearchingPage searchPage;
	
	
	
@BeforeMethod
	
	public void firststep() {
		initiation();
		
		utilities = new Utilities();
		loginpage = new LoginPage();
	    homepage = new Homepage();
	    searchPage=new SearchingPage();
	
	
	    loginpage.enteremail(prop.getProperty("username"));
		loginpage.enterpassword(prop.getProperty("password"));
}
/*	
@Test
public void searchByPartialText() {
	Assert.assertTrue(searchPage.searchByPartialText(prop.getProperty("partialItemText")));
}

 
 
@Test
public void searchDescriptionText() {
	String prodName = prop.getProperty("description");
	Assert.assertEquals(prodName, searchPage.searchDescriptionTxt(prodName));
}*/

@Test
public void searchByKeyword() {
	Assert.assertTrue(searchPage.searchByKeyword(prop.getProperty("keyword")));
}
	
	
	
	
	

}
