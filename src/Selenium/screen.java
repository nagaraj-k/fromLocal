package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class screen {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagaraj\\Documents\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/met_document_getelementbyid.asp");
		WebElement we = driver.findElement(By.cssSelector("a#navbtn_tutorials>i.fa.fa-caret-down"));
		Select dr = new Select(we);
		dr.selectByIndex(0);
		//driver.findElement(By.linkText("Learn JavaScript")).click();
		/*Thread.sleep(3000); text()="Learn JavaScript"
		driver.findElement(By.cssSelector("a[class='topnav-icons fa w3-right w3-bar-item w3-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.gsc-input")).sendKeys("hihi"+Keys.ENTER);
		Thread.sleep(10000);
		driver.switchTo().frame("{\"name\":\"master-1\",\"master-1\":{\"personalizedAds\":true,\"position\":\"top\",\"cseGoogleHosting\":\"partner\",\"hl\":\"en\",\"columns\":1,\"horizontalAlignment\":\"left\",\"resultsPageQueryParam\":\"query\",\"type\":\"ads\",\"linkTarget\":\"_top\"}}");
		Robot rb = new Robot();
		rb.mouseWheel(20);
		//System.out.println(driver.getTitle());
		//driver.findElement(By.cssSelector("div.gsc-results-close-btn.gsc-results-close-btn-visible")).click();
		//Alert al = driver.switchTo().alert();
		//al.dismiss();*/
		Thread.sleep(5000);
		driver.close();
	}

}
