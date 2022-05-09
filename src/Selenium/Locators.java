package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagaraj\\Documents\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("input<:><type>=<text>")).sendKeys("mobiles"+Keys.ENTER);
		//driver.findElement(By.cssSelector("input")).sendKeys("mobiles"+Keys.ENTER);
		//driver.findElement(By.name("q")).sendKeys("mobiles"+Keys.ENTER);
		Thread.sleep(3000);
		

	}

}
