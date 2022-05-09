package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ThirdScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nagaraj\\Documents\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.javatpoint.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("scrollBy(0,5000)");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Core Java")).click();
		Thread.sleep(3000);
		
		driver.close();
	}

}
