package Selenium;

import java.awt.AWTException;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class robotclass {

	public static void main(String[] args) throws AWTException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagaraj\\Documents\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ganttexcel.com/free-gantt-chart-excel-template-d3/?utm_campaign=13110492214-121577606639&utm_kwd=gantt+chart+excel&utm_source=google&utm_medium=cpc&utm_content=521727312366&gclid=Cj0KCQjwwLKFBhDPARIsAPzPi-It6ukXoxNEi9HlXpFjT3yMU-bQiTj32kLENIGpcNydhJ9O6aw-fdgaAoRwEALw_wcB");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(5000);
		WebElement dn1=driver.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/div[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]"));
		clickon(driver,dn1,10);
		//Robot rb = new Robot();
		WebElement dn2 = driver.findElement(By.cssSelector("button.pum-close.popmake-close"));
		Thread.sleep(5000);
		clickon(driver,dn2,10);
		//rb.keyPress(KeyEvent.VK_ESCAPE);
		//rb.keyPress(KeyEvent.VK_ALT);
		/*rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		WebElement fn = driver.findElement(By.cssSelector("input#input_4_4_3"));
		sendkeys(driver,fn,10,"raj");
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		WebElement ln = driver.findElement(By.cssSelector("input#input_4_4_6"));
		sendkeys(driver,ln,10,"kumar");
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		WebElement email = driver.findElement(By.cssSelector("input#input_4_2"));
		sendkeys(driver,email,10,"rajkumar@gmail.com");
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		WebElement btncl = driver.findElement(By.cssSelector("input#gform_submit_button_4"));
		clickon(driver,btncl,10);
		Thread.sleep(3000);
		rb.mouseWheel(15);
		WebElement dn = driver.findElement(By.cssSelector("div.elementor-widget-container>div.elementor-button-wrapper>a.elementor-button-link.elementor-button.elementor-size-lg"));
		clickon(driver,dn,10);
		//rb.keyPress(KeyEvent.VK_ENTER);
		//rb.keyRelease(KeyEvent.VK_ENTER);
		*/Thread.sleep(5000);
		
		driver.close();
	}

	private static void clickon(WebDriver driver, WebElement btncl, int i) {
		new WebDriverWait(driver,i).until(ExpectedConditions.elementToBeClickable(btncl));
		btncl.click();
	}

	private static void sendkeys(WebDriver driver, WebElement fn, int i, String string) {
		new WebDriverWait(driver,i).until(ExpectedConditions.visibilityOf(fn));
		fn.sendKeys(string);
		
	}
}
