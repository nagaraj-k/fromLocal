package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagaraj\\Documents\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://login.yahoo.com");
		
		WebElement un = driver.findElement(By.cssSelector("form[id=login-username-form][class=pure-form]>div:first-of-type>div:nth-of-type(3)>input[type=text][id=login-username]"));
		 String st="hello@";
		 un.sendKeys(st);
		// Object un1=un.getText();
		System.out.println(st);
		WebElement dom = driver.findElement(By.cssSelector("form[id=login-username-form][class=pure-form]>div:first-of-type>div:nth-of-type(3)>ul.auto-fill-overlay>li:nth-of-type(4)"));
		String dom1 = dom.getText();
		System.out.println(dom1);
		System.out.println(st+dom1);
		driver.findElement(By.cssSelector("form[id=login-username-form][class=pure-form]>div:first-of-type>div:nth-of-type(3)>input[type=text][id=login-username]")).sendKeys(dom1);
		driver.findElement(By.cssSelector("form[id=login-username-form][class=pure-form]>div:nth-of-type(n)>div.helper-item>span.stay-signed-in.checkbox-container>label[for=persistent]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("form[id=login-username-form][class=pure-form]>div:nth-of-type(n)>input#login-signin")).click();
		
		//driver.findElement(By.xpath("//div[contains(@class,'help')]//ancestor::div[contains(@class,'helper-item')]//following-sibling::div[@class='helper-item arlink']//span[@class='help']//a[contains(text(),'Forgot')]")).click();
		//driver.findElement(By.xpath("//input[contains(@id,'in')]//parent::div[starts-with(@class,'button')]")).click();
		//driver.findElement(By.xpath("//p[@class='sign-up-link']//child::a[contains(@id,'acc')]")).click();
		//driver.findElement(By.xpath("//div[@id='username-field-icon']//parent::div[@class='input-group']//preceding-sibling::input[@id='login-username']")).sendKeys("hi");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}

}
