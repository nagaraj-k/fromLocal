package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagaraj\\Documents\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/?gws_rd=ssl");
		driver.navigate().to("https://www.google.com/?gws_rd=ssl");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Wish you all the best");
		driver.findElement(By.name("btnK")).submit();
		Thread.sleep(2000);
		/*try
		{
		Thread.sleep(2000);
		}
		catch(InterruptedException ie)
		{
			System.out.println("Handled");
		}*/
		driver.quit();
	}

}
