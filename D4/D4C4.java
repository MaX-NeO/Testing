package com.selenium.Cse1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D4C4 {

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
		    	String t1=driver.getCurrentUrl();
		    	String t2="https://j2store.net/free/";
		    	System.out.println(t1);
		    	if(t1.equals(t2))
		    	{	System.out.println("Correct Url");
		    	}
		    	else
		    	{	System.out.println("Wrong Url");
		    	}
	}

}
