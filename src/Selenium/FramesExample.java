package Selenium;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesExample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nagaraj\\Documents\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/nagaraj/Desktop/try.htm");
		//driver.switchTo().frame(0);
		WebElement textbcs = driver.findElement(By.cssSelector("iframe[name=gaana]")); 
		driver.switchTo().frame(textbcs);
		WebElement sigo = driver.findElement(By.cssSelector("a[title='Discuss improvements to the content page [alt-shift-t]']"));
		
		Actions mv = new Actions(driver);
		mv.moveToElement(sigo).build().perform();
		mv.click(sigo).build().perform();
		/*Robot ac = new Robot();
		ac.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		ac.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);*/
		
		//driver.findElement(By.cssSelector("a[id=b-more][class=b-link]")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Google-link")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
