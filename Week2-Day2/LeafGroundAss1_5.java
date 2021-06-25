package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAss1_5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();

		// Are you enjoying the classes?

		driver.findElement(By.xpath("//div[@id='first']/label[1]")).click();

		// Find default selected radio button

		int tottCheckBoxes = driver.findElementsByXPath("//input[@name='news']").size();

		for (int i = 0; i < tottCheckBoxes; i++) {
			boolean selCheckBox = driver.findElementByXPath("//input[@name='news' and @value='" + i + "']")
					.isSelected();
			if (selCheckBox) {
				String attrVal = driver.findElementByXPath("//input[@name='news' and @value='" + i + "']")
						.getAttribute("value");
				if (attrVal.equals("0"))
					System.out.println("Default checkbox is UnChecked");
				else
					System.out.println("Default checkbox is Checked");

			}

		}

		// Select your age group (Only if choice wasn't selected)

		int myAge = 20;

		if (myAge <= 20) {

			boolean selVal1 = driver.findElement(By.xpath("//input[@name='age' and @value='0']")).isSelected();

			if (!selVal1)
				driver.findElement(By.xpath("//input[@name='age' and @value='0']")).click();
		} else if (myAge <= 40) {

			boolean selVal2 = driver.findElement(By.xpath("//input[@name='age' and @value='1']")).isSelected();

			if (!selVal2)
				driver.findElement(By.xpath("//input[@name='age' and @value='1']")).click();
		}

		else {
			boolean selVal3 = driver.findElement(By.xpath("//input[@name='age' and @value='2']")).isSelected();

			if (!selVal3)
				driver.findElement(By.xpath("//input[@name='age' and @value='2']")).click();

		}

	}

}
