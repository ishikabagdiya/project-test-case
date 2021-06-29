package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BrowserFactory;

public class TaxTest extends BrowserFactory {
		@Test
		 public static void  Tax() throws InterruptedException {
			 Pages.Tax ddf = PageFactory.initElements(driver,Pages.Tax.class);
			   	ddf.taxbutton("All good","all good");
			   	
		
	 

	}
	}


