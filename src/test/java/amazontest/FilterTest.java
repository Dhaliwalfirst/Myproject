package amazontest;



import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import amazonbase.Testbase;
import amazonpage.FilterPage;
import amazonpage.Homepage;
import amazonpage.LoginPage;
import util.Utilities;

public class FilterTest extends Testbase{
	Utilities utilities;
	LoginPage loginpage;
	Homepage homepage;
   FilterPage  filterpage;
   Logger log;

	
	
@BeforeMethod
	
	public void setup() {
		initiation();
		 homepage =new Homepage();
		 utilities = new Utilities();
		 loginpage = new LoginPage();
		 loginpage.enteremail(prop.getProperty("username"));
		 loginpage.enterpassword(prop.getProperty("password"));
         filterpage  = new FilterPage();
         log = Logger.getLogger(FilterTest.class);
}
/*
@Test
public void sortingCustomerReview() {
	filterpage.sortingByCustomerReview(prop.getProperty("product"));
	log.info("this method is to filter items based upon their data of arrival");
}}
	
@Test
public void sortingByPrice() {
	Assert.assertTrue(filterpage.sortByPriceHighToLow(prop.getProperty("product")));
	log.info("this filter is to sort items based upon its price");

}
@Test
public void sortingByPriceagain() {
	Assert.assertTrue(filterpage.sortByPriceLowtoHigh(prop.getProperty("product")));
	log.info("this filter is to sort items based upon its price");

}
@Test
public void sortingnewArrival() {
	filterpage.sortingNewArrival(prop.getProperty("product"));
	log.info("this method is to filter items based upon their data of arrival");
}

@Test
public void filterByPrice() {
	Assert.assertTrue(filterpage.filterByPrice(prop.getProperty("productsFilter")));
	log.info("this filter is to sort items based upon its price under 25");
}

@Test

public void filterByBrandName() {
	Assert.assertTrue(filterpage.Filterbrandnameoption(prop.getProperty("productsFilter")));
	log.info("this filter is to sort items based upon brand name");
}

*/
@Test

public void filterByroomtype() {
	Assert.assertTrue(filterpage.Filterroomtypeoption(prop.getProperty("productsFilter")));
	log.info("this filter is to sort items based upon brand name");
}

}
