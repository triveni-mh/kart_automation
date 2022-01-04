package pom_pages;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Compareitem extends Base{
	public static Properties prop;
	String aprice;
	String fprice;
	String f_price;
	
	Iterator<String> w;
	String w3;
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']\n")
	WebElement fcancelbutton;
	
	@FindBy(xpath="//input[@title='Search for products, brands and more']")
	WebElement fsearchbox;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/ul")
	WebElement fsearchicon;
	
	@FindBy(xpath="//img[contains(@alt,'APPLE Airpods Pro With Wireless Charging Case Active noise cancellation enabled Bluetooth Headset')]")
	WebElement fairpodslink;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[4]/div[1]/div/div[1]")
	WebElement ftprice;
	
	
	  //amazon locators
      @FindBy(id="twotabsearchtextbox")
      WebElement amazon_searchbox;
      
      @FindBy(id="nav-search-submit-button")
      WebElement amazon_searchicon;
      
       @FindBy(xpath="//img[@alt='Sponsored Ad - Apple AirPods Pro']")
       WebElement a_item_link;
       
      @FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/a/span[1]/span[2]/span[2]")
      WebElement a_price;
      
	   public Compareitem() {
		PageFactory.initElements(driver, this);
	}
	   public void flipkart() {
			fcancelbutton.click();
			fsearchbox.sendKeys("Apple airpods pro");
			fsearchbox.sendKeys(Keys.ENTER);
			System.out.println(driver.getTitle());
			fairpodslink.click();
	        Set<String> s=driver.getWindowHandles();
			Iterator<String> w = s.iterator();
			w.next();
			String w2=w.next();
			driver.switchTo().window(w2);
			//w3=w.next();
			fprice=ftprice.getText();
			String p[]=fprice.split("₹");
			f_price=p[1];
			System.out.println(p[1]);
			
			
	   }
	
	public void amazon() {
		driver.navigate().to("https://www.amazon.in/");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		amazon_searchbox.sendKeys("Apple airpods pro");
		amazon_searchicon.click();
		//a_item_link.click();
		/*Set<String> s1=driver.getWindowHandles();
		Iterator<String> window= s1.iterator();
		window.next();
		String window2=window.next();*/
		
		aprice=a_price.getText();
		System.out.println(a_price.getText());
		//return a_price.getText();
		
		}
	
	
	
	
	public String comparisionOnPrices() {
		
		long flipkartprice=Long.parseLong(f_price);
		long amazonprice=Long.parseLong(aprice);
		if(flipkartprice==amazonprice) return "This item has same price in both Amazon and flipkart";
		else if(flipkartprice>amazonprice) return "This item is cheaper in Amazon";
		else return "This item is cheaper in Flipkart";
		
		
		
		
		
		
}

}
