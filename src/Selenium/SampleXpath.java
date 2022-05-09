package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagaraj\\Documents\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.cssSelector("input.RNmpXc[value*='Feel'][type='submit']")).submit();
		/*List <WebElement> linklist = driver.findElements(By.tagName("a"));	
		System.out.println(linklist.size());
		for(WebElement i : linklist)
		{
			String s =i.getText(); 
			System.out.println(s);
		}
		//driver.findElement(By.xpath("//input[starts-with(@type,'te')]")).sendKeys("Search for xpath"+Keys.ENTER);
		//String <WebElement> s= driver.findElement(By.xpath("contains(@type,'text'))"));
		//driver.findElement(By.xpath("//input[substring(String.get(type), string-length(@type) - string-length('text') +1) = 'xt']")).sendKeys("Search for xpath"+Keys.ENTER);
		*/
		Thread.sleep(3000);
		driver.close();

	}

}
