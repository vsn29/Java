package com.section12;
// Requirements :

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//==================================================================================

// Step 1: Select any checkbox
//
// Step 2: Grab the label of the selected checkbox // OR put into a variable

//Step 3: Select an option in dropdown, Here option to select should come from step 2// dont hardcode the text.drive it directly from
//        step 2

// Step 4: Enter the Step 2 grabbed label text in the edit box

// Step 5; Click Alert and then verify if text grabbed from step 2 is present in the pop up message

// Note: do not hard the label part.

public class Assignment5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://SeleniumCourse//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://qaclickacademy.com/practice.php");

		// Click the checkbox
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();

		// Get the option2 value and store in "opt"
		String opt = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

		// Select the grabbed text(i.e opt) from the dropdown
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));

		Select s = new Select(dropdown);

		s.selectByVisibleText(opt);

		// Enter the option2 in alert box
		driver.findElement(By.name("enter-name")).sendKeys(opt);

		// Click on the alert box
		driver.findElement(By.id("alertbtn")).click();

		// Now we need to check Whether the alert box display the selected text
		// i,e "Option2" so we need to
		// switch to the alert window
		String text = driver.switchTo().alert().getText();

		// Condition to chech the "Option2"
		if (text.contains(opt))

		{

			System.out.println("Alert message success");

		}

		else

			System.out.println("Something wrong with execution");

	}

	// System.out.println(driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());

}