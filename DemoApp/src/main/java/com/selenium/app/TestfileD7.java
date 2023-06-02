package com.selenium.appd7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test02 {
	WebDriver driver;
  @Test(priority = 1)
  public void Title() {
	  String t1 = driver.getTitle();
	  String t2 = "[ Selenium Testing Libs ][ MaX ]";
	  System.out.println(t1);
	  if(t1.equals(t2)) {
		  System.out.println("title matched");
	  }
	  else {
		  System.out.println("Invalid Title");
	  }
  }
  @Test(priority = 2)
  public void Name() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"root\"]/form/span/input[1]")).sendKeys("Mohanraj M");
	  Thread.sleep(3000);
	  
  }
  @Test(priority = 3)
  public void Email() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"root\"]/form/span/input[2]")).sendKeys("max.neo.dev@gmsil.com");
	  Thread.sleep(3000);
  }
  @Test(priority = 4)
  public void Add() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"root\"]/form/span/button")).click();
	  Thread.sleep(3000);
  }
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.get("https://maxneo.netlify.app/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  
  }

}
