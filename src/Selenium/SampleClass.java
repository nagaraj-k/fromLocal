package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagaraj\\Documents\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com");
		//WebElement sb= driver.findElement(By.xpath("//input[@id='login-username']"));
		Thread.sleep(2000);
		//sb.sendKeys("Searching for you");
		driver.findElement(By.partialLinkText("Create")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.name("shortCountryCode")).sendKeys("Brazil"+Keys.ENTER);
		//driver.findElement(By.id("usernamereg-phone")).sendKeys("12453");
		Thread.sleep(5000);
		driver.close();
	}

}
