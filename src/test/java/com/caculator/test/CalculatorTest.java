package com.caculator.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseTest{
    @Test
    public void addShouldSuccess(){
        driver.findElement(By.id("btn_7")).click();
        driver.findElement(By.id("plus")).click();
        driver.findElement(By.id("btn_3")).click();
        driver.findElement(By.id("equal")).click();
        Assert.assertEquals(10,driver.findElement(By.id("formula")).getText().trim());
    }
    @Test
    public void subShouldSuccess(){
        driver.findElement(By.id("btn_7")).click();
        driver.findElement(By.id("minus")).click();
        driver.findElement(By.id("btn_3")).click();
        driver.findElement(By.id("equal")).click();
        Assert.assertEquals(7,driver.findElement(By.id("formula")).getText().trim());
    }
    @Test
    public void multiplyShouldSuccess(){
        driver.findElement(By.id("btn_7")).click();
        driver.findElement(By.id("multi")).click();
        driver.findElement(By.id("btn_3")).click();
        driver.findElement(By.id("equal")).click();
        Assert.assertEquals(21,driver.findElement(By.id("formula")).getText().trim());
    }
    @Test
    public void divShouldSuccess(){
        driver.findElement(By.id("btn_6")).click();
        driver.findElement(By.id("divi")).click();
        driver.findElement(By.id("btn_2")).click();
        driver.findElement(By.id("equal")).click();
        Assert.assertEquals(21,driver.findElement(By.id("formula")).getText().trim());
    }
}
