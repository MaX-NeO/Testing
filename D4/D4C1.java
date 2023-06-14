package com.selenium.Cse1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D4C1 {

	public static void main(String[] args) throws Exception {
		// Driver setup
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
	//open an url
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,1000)","");
    	
		WebElement fn= driver.findElement(By.id("input-firstname"));
		fn.sendKeys("Arun");
		WebElement ln= driver.findElement(By.id("input-lastname"));
		ln.sendKeys("Kumar");
		WebElement em= driver.findElement(By.id("input-email"));
		em.sendKeys("Kumar@gmail.com");
		WebElement pwd= driver.findElement(By.id("input-password"));
		pwd.sendKeys("Kumar@1");
		WebElement sub= driver.findElement(By.id("input-newsletter-yes"));
		sub.click();
		
		driver.quit();
		
	}

}
