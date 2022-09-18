package page;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	public static WebDriver driver;
	
	public static void initDriver() {	
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public static void tearDown() {
		driver.close();
		driver.quit();
	}
	
	public static int randNum() { 
		Random rand = new Random();
		int randNum = rand.nextInt(99999999);
	    return randNum;
	}
	
	
	
	public static int randTitle() {
		Random rand2 = new Random();
		int randTitle = rand2.nextInt(999);
		return randTitle;				
	}
}
