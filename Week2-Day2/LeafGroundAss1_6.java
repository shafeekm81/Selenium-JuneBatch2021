package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAss1_6 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();

//		Select the languages that you know?

		driver.findElement(By.xpath("//label[text() = 'Select the languages that you know?']/following::input[1]"))
				.click();
		driver.findElement(By.xpath("//label[text() = 'Select the languages that you know?']/following::input[3]"))
				.click();
		driver.findElement(By.xpath("//label[text() = 'Select the languages that you know?']/following::input[5]"))
				.click();

//		Confirm Selenium is checked

		boolean isSeleniumChecked = driver
				.findElement(By.xpath("//label[text() = 'Confirm Selenium is checked']/following::input")).isSelected();

		if (isSeleniumChecked)
			System.out.println("Selenium is selected");
		else
			System.out.println("Not Selected");

//DeSelect only checked

		for (int i = 1; i <= 2; i++) {

			boolean selChckBox = driver
					.findElement(By.xpath("//label[text() = 'DeSelect only checked']/following::input[" + i + "]"))
					.isSelected();

//	System.out.println(selChckBox);

			if (selChckBox)
				driver.findElement(By.xpath("//label[text() = 'DeSelect only checked']/following::input[" + i + "]"))
						.click();

		}

//		Select all below checkboxes

		int noOfChkBoxes = driver
				.findElements(By.xpath("//label[text() = 'Select all below checkboxes ']/following::input")).size();

		for (int i = 1; i <= noOfChkBoxes; i++) {

			driver.findElement(By.xpath("//label[text() = 'Select all below checkboxes ']/following::input[" + i + "]"))
					.click();

		}

	}

}
