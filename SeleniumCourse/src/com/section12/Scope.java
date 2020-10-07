package com.section12;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.util.Strings;

//Give me the count of links on the page

public class Scope {

	public static void main(String[] args) throws InterruptedException {

		// Step 1: Get the a(anchor tag) links present on the page

		System.setProperty("webdriver.chrome.driver", "C://SeleniumCourse//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// This step will list the number of links present on the page
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// Print the number of links present on the page
		System.out.println("Number of links present on the page is : " + links.size());

		// How do you limit the WebDriver scope

		// Fetch the total number of links present at the footer only

		// This line of code gets all the links present on the footer of the
		// page

		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));

		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//Case 3: list 
		WebElement columnDriver=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	  System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		//Case 4: Click on each link in the column and check if the pages are opening.
		
		for(int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++){
			
			String clickOnLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000);
			
		}
		
		Set<String> tabTitle=driver.getWindowHandles(); //4 windows
		Iterator<String> it= tabTitle.iterator();
		
		while(it.hasNext()){
			
			
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
		
		
	}

}
