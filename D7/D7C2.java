package com.selenium.Cse1;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class D7C2 {
	int a=7,b=2,c;
  @Test(priority=4)
  public void add() {
  c=a+b;
  Assert.assertEquals(c, 9);
  }
  @Test(priority=3)
  public void sub() {
  c=a-b;
  Assert.assertEquals(c, 5);
  }
  @Test(priority=2)
  public void mul() {
  c=a*b;
  Assert.assertEquals(c, 14);
  }
  @Test(priority=1)
  public void div() {
  c=a/b;
  Assert.assertEquals(c, 3);
  }
}
