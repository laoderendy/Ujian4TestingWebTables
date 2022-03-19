package com.juaracoding.TestingWebtables;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PositiveCase1 {
	
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
		
		
		WebElement inputFirstName = driver.findElement(By.id("firstName"));
		wait.until(ExpectedConditions.elementToBeClickable(inputFirstName));
		inputFirstName.sendKeys("LAODE");	
		
		WebElement inputLastName = driver.findElement(By.id("lastName"));
		wait.until(ExpectedConditions.elementToBeClickable(inputLastName));
		inputLastName.sendKeys("RENDY");
		
		WebElement inputEmail = driver.findElement(By.id("userEmail"));
		wait.until(ExpectedConditions.elementToBeClickable(inputEmail));
		inputEmail.sendKeys("laoderendy@yahoo.com");
		
		WebElement inputAge = driver.findElement(By.id("age"));
		wait.until(ExpectedConditions.elementToBeClickable(inputAge));
		inputAge.sendKeys("19");
		
		WebElement inputSalary = driver.findElement(By.id("salary"));
		wait.until(ExpectedConditions.elementToBeClickable(inputSalary));
		inputSalary.sendKeys("2000500");
		
		WebElement inputDept = driver.findElement(By.id("department"));
		wait.until(ExpectedConditions.elementToBeClickable(inputDept));
		inputDept.sendKeys("IT");
		
		WebElement Submit = driver.findElement(By.id("submit"));
		wait.until(ExpectedConditions.elementToBeClickable(Submit));
		Submit.click();

	}

}
