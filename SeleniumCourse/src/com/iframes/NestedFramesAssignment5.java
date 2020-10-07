package com.iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesAssignment5 {

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver", "C://SeleniumCourse//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Nested Frames")).click();

		driver.switchTo().frame("frame-top");

		driver.switchTo().frame("frame-middle");

		String text = driver.findElement(By.id("content")).getText();

		System.out.println("Text of the Frame is : " +text);

	}

}
