package com.selenium.Cse1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D4C3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Driver setup
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
	//open an url
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,1000)","");
    	driver.findElement(By.linkText("Clothing (5)")).click();
    	driver.navigate().back();
    	Thread.sleep(3000);
    	driver.navigate().forward();
    	Thread.sleep(3000);
    	driver.navigate().refresh();
    	driver.quit();
	}

}
