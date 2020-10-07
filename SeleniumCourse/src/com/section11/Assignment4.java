package com.section11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://SeleniumCourse//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Multiple Windows")).click();

		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();

		driver.findElement(By.xpath("//div[@class='example']/h3")).getText();

		Set<String> abc = driver.getWindowHandles();

		Iterator<String> it = abc.iterator();

		String parentWindow = it.next();

		driver.switchTo().window(it.next());

		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());

		driver.switchTo().window(parentWindow);

		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

	}

}
