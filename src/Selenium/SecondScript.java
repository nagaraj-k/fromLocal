package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondScript {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nagaraj\\Documents\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		//driver.navigate().to("google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Hello world");
		driver.findElement(By.name("btnK")).submit();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Handled properly");
		}
		//driver.findElement(By.className("gNO89b")).click();
		String gt = driver.getTitle();
		String at= "Hello world - Google Search";
		System.out.println("The title is "+gt);
		driver.close();
		if(gt.equalsIgnoreCase(at)) {
			System.out.println("WE GOT IT");
		}
		else
		{
			System.out.println("We Didn't get it");
		}

	}

}