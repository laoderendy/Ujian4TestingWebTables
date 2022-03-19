package com.juaracoding.TestingWebtables;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NegativeCase1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com");
		driver.manage().window().maximize(); 
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0, 500)");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement clickElement = driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1) > div"));
		clickElement.click();
		
		JavascriptExecutor je1 = (JavascriptExecutor) driver;
		je1.executeScript("window.scrollBy(0, 500)");
		
		WebElement clickWebTables = driver.findElement(By.id("item-3"));
		wait.until(ExpectedConditions.elementToBeClickable(clickWebTables));
		clickWebTables.click();
		
		WebElement clickAdd = driver.findElement(By.id("addNewRecordButton"));
		wait.until(ExpectedConditions.elementToBeClickable(clickAdd));
		clickAdd.click();
		
		WebElement clickAdd1 = driver.findElement(By.id("addNewRecordButton"));
		wait.until(ExpectedConditions.elementToBeClickable(clickAdd1));
		clickAdd1.click();
		
		WebElement inputFirstName1 = driver.findElement(By.id("firstName"));
		wait.until(ExpectedConditions.elementToBeClickable(inputFirstName1));
		inputFirstName1.sendKeys("12345");	
		
		WebElement inputLastName1 = driver.findElement(By.id("lastName"));
		wait.until(ExpectedConditions.elementToBeClickable(inputLastName1));
		inputLastName1.sendKeys("!!!!@@@");
		
		WebElement inputEmail1 = driver.findElement(By.id("userEmail"));
		wait.until(ExpectedConditions.elementToBeClickable(inputEmail1));
		inputEmail1.sendKeys("12345@yahoo");
		
		WebElement inputAge1 = driver.findElement(By.id("age"));
		wait.until(ExpectedConditions.elementToBeClickable(inputAge1));
		inputAge1.sendKeys("3o");
		
		WebElement inputSalary1 = driver.findElement(By.id("salary"));
		wait.until(ExpectedConditions.elementToBeClickable(inputSalary1));
		inputSalary1.sendKeys("Rp.20.000");
		
		WebElement inputDept1 = driver.findElement(By.id("department"));
		wait.until(ExpectedConditions.elementToBeClickable(inputDept1));
		inputDept1.sendKeys("Null");
		
		WebElement Submit1 = driver.findElement(By.id("submit"));
		wait.until(ExpectedConditions.elementToBeClickable(Submit1));
		Submit1.click();

	}
}