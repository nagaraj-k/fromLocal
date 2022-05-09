package Selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class FLUENTWAIT {

	private static final String FLuentWait = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagaraj\\Documents\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://html.com/input-type-file");
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,700)");
		//Alert alrt = driver.switchTo().alert();
		//alrt.dismiss();
		//driver.findElement(By.cssSelector("span.forgotlink>a")).click();
		/*Thread.sleep(5000);//xpath("//input[@type='submit']")).click();
		Alert alrt = driver.switchTo().alert();
		System.out.println(alrt.getText());
		String text= alrt.getText();
		boolean res = text.equalsIgnoreCase("please Enter a valid user name");
				//("please Enter a valid user name");
		if(res)
		{
			System.out.println("Alert is correct");
			alrt.accept();
		}
		else
		{
			System.out.println("Aler is not correct");
			//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		}
		
		Thread.sleep(5000);*/
		/*driver.findElement(By.cssSelector("span.forgotlink>a")).sendKeys("rajahridaya");
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		Alert alrt=driver.switchTo().alert();
		System.out.println(alrt.getText());
		boolean res = alrt.equals("Please enter your email ID");
		if(res)
		{
			System.out.println("The alert is correct");
		}
		else
		{
			System.out.println("the alert is incorrect");
		}*/
		//driver.findElement(By.cssSelector("button.l3tlg0-2.enfNez>div.sc-1gyxcpm-0.csDfHB")).click();
		
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		/*js1.executeScript("window.scrollBy(0,50)");	
		Thread.sleep(3000);
		WebElement fromDevice = driver.findElement(By.cssSelector("div.l3tlg0-3.fplmen>button:first-of-type"));*/
		WebElement fdr=driver.findElement(By.cssSelector("input[type=file]"));
		
		sendKeys(driver,fdr,10,"C:\\Users\\nagaraj\\Desktop\\trials.docx");
		//clickon(driver,fromDevice,10);
		//driver.findElement(By.cssSelector("div.l3tlg0-3.fplmen>button:first-of-type")).click(); //sendKeys("Desktop/trials.docx");
		Thread.sleep(10000);
	}

	private static void sendKeys(WebDriver driver, WebElement fromDevice, int i, String pat) {
		System.out.println(pat);
		new WebDriverWait(driver,i).until(ExpectedConditions.visibilityOf(fromDevice));
		fromDevice.sendKeys(pat);
		
	}

	/*private static void clickon(WebDriver driver, WebElement fromDevice, int i) {
		new WebDriverWait(driver,i).until(ExpectedConditions.elementToBeClickable(fromDevice));
		fromDevice.click();
		
	}*/
	
	
	
	}
		