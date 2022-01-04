package pom_pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	public Base() {
		try {
			File file=new File("/Users/trivenimh/eclipse-workspace/Flipkart/kart_automation/src/main/java/pom/properties/config.properties");
			prop = new Properties();
			FileInputStream ip= new FileInputStream(file);
			prop.load(ip);
			if(prop == null) {
				System.out.println("jhdsgfhjd");
			}
			//Users/trivenimh/eclipse-workspace/SeleniumFramework/src/main/java/com/crm/qa/config/config.properties
		}
		catch(FileNotFoundException e) {
			System.out.println("hello");
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		///Users/trivenimh/eclipse-workspace/Flipkart/kart_automation/src/main/java/pom/properties/config.properties
	}
	public static void initialization() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/trivenimh/Downloads/Drivers/chromedriver");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("flipkart_url"));
		WebDriverWait  wait=new WebDriverWait(driver,10);
	}

}
