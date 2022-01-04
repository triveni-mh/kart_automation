package pom_pages;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Additem extends Base {
	public static Properties prop;
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']\n")
	WebElement cancelbutton;
	
	@FindBy(xpath="//input[@title='Search for products, brands and more']")
	WebElement searchbox;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/ul")
	WebElement searchicon;
	
	@FindBy(xpath="//img[contains(@alt,'APPLE Airpods Pro With Wireless Charging Case Active noise cancellation enabled Bluetooth Headset')]")
	WebElement airpodslink;
	
	@FindBy(xpath="//div[@class='_30jeq3 _16Jk6d']")
	WebElement price;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	WebElement addtocart;
	
	@FindBy(xpath="//div[@class='_3dY_ZR']/button[2]")
	WebElement quantity;
	
	@FindBy(xpath="//div[@class='Ob17DV _3X7Jj1']")
	WebElement doubleprice;
	
	
	public Additem() {
		PageFactory.initElements(driver, this);
	}
    
	
	public String searchitem() throws InterruptedException {
		
		cancelbutton.click();
		searchbox.sendKeys("Apple airpods pro");
		searchbox.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		airpodslink.click();
		
		
        Set<String> s=driver.getWindowHandles();
		Iterator<String> w = s.iterator();
		w.next();
		String w2=w.next();
		driver.switchTo().window(w2);
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		String singleprice=price.getText();
		System.out.println(singleprice);
		addtocart.click();
		quantity.click();
		//WebDriverWait wait = new WebDriverWait(driver,10);
		Thread.sleep(1000);
		System.out.println(doubleprice.getText());
		//driver.navigate().to("https://www.amazon.in/");
		return singleprice;
		
		
		
		
	}
	
}
