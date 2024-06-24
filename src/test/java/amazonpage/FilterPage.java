package amazonpage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import amazonbase.Testbase;
import util.Utilities;

public class FilterPage extends Testbase {
	
	Utilities utilities = new Utilities();
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchbtn;
	
	@FindBy(xpath = "//select[@id='s-result-sort-select']")
	WebElement selectDropDown;
	
	//Select select = new Select(selectDropDown);
	
	@FindBy(id="s-result-sort-select_0")
	WebElement featured;
	
	@FindBy (id="s-result-sort-select_1")
	List<WebElement> priceList;
	
	@FindBy(xpath="//span[normalize-space()='Avg. customer review']")
	List<WebElement> customerRating;
	
	@FindBy(id="s-result-sort-select_4")
	List<WebElement> newArrivalFilter;
	
	@FindBy(id="p_36/range-slider_slider-item_upper-bound-slider")
	WebElement priceFilter;
	
	@FindBy(xpath = "//div[@id='brandsRefinements']//span[@class='a-size-base a-color-base'][normalize-space()='Levoit']")
	WebElement brandsFilter;
	
	@FindBy(xpath="//span[normalize-space()='Brands']")
	List<WebElement>brandname;
	
	@FindBy(css="div[id='p_n_feature_two_browse-bin-title'] span[class='a-size-base a-color-base puis-bold-weight-text']")
	List<WebElement>Roomtype;
	
	@FindBy(xpath="//li[@id='p_n_feature_two_browse-bin/24038393011']//i[@class='a-icon a-icon-checkbox']")
	WebElement Roomtypefilter;
	
	
	public FilterPage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean sortingNewArrival(String product) {
		searchbox.clear();
		searchbox.sendKeys(product);
		searchbtn.click();
         Utilities.selectByvalue(selectDropDown, "Newest arrivals");
         
         ArrayList<String> list = new ArrayList<>();
		for (WebElement e : customerRating) {
			String rating = e.getText();
			list.add(rating);
		}
		List<String> l = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(l);
		boolean plan = list.equals(l);
		return plan;
	}
	
	public boolean sortingByCustomerReview(String product) {
		searchbox.clear();
		searchbox.sendKeys(product);
		searchbtn.click();
		Utilities.selectByvalue(selectDropDown, "Avg. customer review");
		

		ArrayList<String> list = new ArrayList<>();
		for (WebElement e : customerRating) {
			String rating = e.getText();
			list.add(rating);
		}
		List<String> l = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(l);
		boolean plan = list.equals(l);
		return plan;
	}
	
    public boolean sortByPriceHighToLow(String product) {
		searchbox.clear();
		searchbox.sendKeys(product);
		searchbtn.click();
		Utilities.selectByvalue(selectDropDown, "Price: High to low");

		ArrayList<String> list = new ArrayList<>();
		for (WebElement e : priceList) {
			String rating = e.getText();
			list.add(rating);
		}
		List<String> l = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(l);
		boolean plan = list.equals(l);
		return plan;

	}
	
	public boolean sortByPriceLowtoHigh(String product) {
		searchbox.clear();
		searchbox.sendKeys(product);
		searchbtn.click();
		Utilities.selectByvalue(selectDropDown, "Price: low to High");

		ArrayList<String> list = new ArrayList<>();
		for (WebElement e : priceList) {
			String rating = e.getText();
			list.add(rating);
		}
		List<String> l = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(l);
		boolean plan = list.equals(l);
		return plan;
	}
	
	
	public boolean Filterbrandnameoption(String  product) {
		searchbox.clear();
		searchbox.sendKeys(product);
		searchbtn.click();
		brandsFilter.click();
		boolean plan=false; 
		
		ArrayList<String> list= new ArrayList<>();
		for(WebElement m : brandname) {
			String brandname = m.getText();
			list.add(brandname);
		}
		if(	list.stream().distinct().collect(Collectors.toList()).size()==1) {
			plan =true;
			
		}
		return plan;
		
	}
	
	public boolean filterByPrice(String product) {
		searchbox.clear();
		searchbox.sendKeys(product);
		searchbtn.click();
		priceFilter.click();
		boolean plan = false;
		ArrayList<String> list = new ArrayList<>();
		for (WebElement e : priceList) {
			String rating = e.getText();
			list.add(rating);
		}
		List<String> l = list.stream().filter(x -> (Double.parseDouble(x) <= 25)).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(l);
		if (l.size() == list.size()) {
			plan = true;
		}
		return plan;
	}
	public boolean Filterroomtypeoption(String  product) {
		searchbox.clear();
		searchbox.sendKeys(product);
		searchbtn.click();
		Roomtypefilter.click();
		boolean plan=false; 
		
		ArrayList<String> list= new ArrayList<>();
		for(WebElement m : Roomtype) {
			String Roomtype = m.getText();
			list.add(Roomtype);
		}
		if(	list.stream().distinct().collect(Collectors.toList()).size()==1) {
			plan =true;
			
		}
		return plan;
	}	
	}



	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	

