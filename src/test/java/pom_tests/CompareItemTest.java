package pom_tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom_pages.Additem;
import pom_pages.Base;
import pom_pages.Compareitem;

public class CompareItemTest extends Base {

	Compareitem compareitem;
	String fprice;
	
	@BeforeMethod
	 public void setup() {
		 initialization();
		 compareitem=new Compareitem();
		 }
	
	  @Test()
	  public void comparision()  {
		  compareitem.flipkart();
		  compareitem.amazon();
		  compareitem.comparisionOnPrices();
		 
		  
		  
	  }
	
	  
    @AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

	
	

}
