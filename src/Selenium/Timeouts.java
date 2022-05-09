package Selenium;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Timeouts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagaraj\\Documents\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		//WebElement clik = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
		//clik.click();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.get("https://www.facebook.com");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter email");
		String email = scan.next();
		System.out.println(email);
		WebElement un = driver.findElement(By.xpath("//input[@id='email']"));
		//un.sendKeys(email);
		sendKeys(driver,un,10,email);
		System.out.println("Enter Password");
		String pwd=scan.next();
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		//pass.sendKeys((pwd));
		System.out.println(pwd);
		sendKeys(driver,pass,10,pwd);
		System.out.println("Now click on login");
		WebElement clik = driver.findElement(By.cssSelector("._6ltg>button[id*=u_0_d_]"));
		//clik.click();
		clickOn(driver,clik,10);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		scan.close();
		
		
		driver.close();
		
	}
	
	

	private static void  sendKeys(WebDriver driver1, WebElement fn1, int i, String val) {
		//System.out.println(fn1+" "+" "+i+" "+val);
		new WebDriverWait(driver1,i).until(ExpectedConditions.visibilityOf(fn1));
		fn1.sendKeys(val);
		//return 0;
	}
	
	private static void clickOn(WebDriver driver12,WebElement cl, int time1)
	{
		new WebDriverWait(driver12,time1).until(ExpectedConditions.elementToBeClickable(cl));
		cl.click();
		//new WebDriverwait(driver1,time1).until(ExpectedConditions.elementToBeClickable(cl));
		
	}



	
}
