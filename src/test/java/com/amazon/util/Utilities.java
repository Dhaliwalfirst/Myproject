package com.amazon.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utilities {

	//public static void selectByvalue(WebElement quantityincart, String string) {
		// TODO Auto-generated method stub
		
		public static void selectByvalue(WebElement element, String value) {
			Select select = new Select(element);
			select.selectByVisibleText(value);
		}
		
		
		
	

}
