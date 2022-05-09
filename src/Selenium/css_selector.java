package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagaraj\\Documents\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.cssSelector(".gLFyf[aria-autocomplete=\"both\"]")).sendKeys("Laptops"+Keys.ENTER);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		js.executeScript("window.scrollBy(0,300)");
		
		/*driver.findElement(By.cssSelector());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();*/
	}

}
