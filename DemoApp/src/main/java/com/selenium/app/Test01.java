package com.selenium.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test01 {

	public static void main(String[] args) {
		//Setting Web Driver
		WebDriverManager.edgedriver().setup();
		
		//Start Edge instance
		WebDriver driver = new EdgeDriver();
		
		//URL
		driver.get("https://www.google.com/");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//To close the driver
		driver.close();
		
	
	}

}
