package com.selenium.Cse1;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.DataProvider;

public class D9C1 {
  @Test(dataProvider = "dp")
  public void add(Integer n, Integer s) {
	  System.out.println(n+s);
  }
  @Test(dataProvider = "dp")
  public void sub(Integer n, Integer s) {
	  System.out.println(n-s);
  }
  @Test(dataProvider = "dp")
  public void multi(Integer n, Integer s) {
	  System.out.println(n*s);
  }
  @Test(dataProvider = "dp")
  public void div(Integer n, Integer s) {
	  System.out.println(n/s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 10, 2 },
      new Object[] { 9,3 },
    };
    
    
  }
}
