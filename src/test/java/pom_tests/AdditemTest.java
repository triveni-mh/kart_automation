package pom_tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom_pages.Additem;
import pom_pages.Base;

public class AdditemTest extends Base {
	Additem additem;


 @BeforeMethod
 public void setup() {
	 initialization();
	 additem=new Additem();
	 
	 
 }
  @Test
  public void addItemToCart() throws InterruptedException {
	  additem.searchitem();
  }

  
  @AfterMethod
	public void tearDown() {
		driver.quit();
		
	}


}