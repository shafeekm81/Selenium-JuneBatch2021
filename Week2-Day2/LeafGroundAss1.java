package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAss1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get(" http://leafground.com/pages/Edit.html");

		driver.manage().window().maximize();
		
		//Enter your email address
		
		driver.findElement(By.id("email")).sendKeys("shafeekmohamed@hotmail.com");
		
		//Append a text and press keyboard tab
		
		String fieldVal = driver.findElement(By.xpath("//div[@class='example'][2]//input")).getAttribute("value");
		
//		System.out.println(fieldVal);
		
		driver.findElement(By.xpath("//div[@class='example'][2]//input")).clear();
		
		driver.findElement(By.xpath("//div[@class='example'][2]//input")).sendKeys(fieldVal + "shafeek");
		
		//Get default text entered
		
		String textVal = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[3]/input")).getAttribute("value");
		
		System.out.println(textVal);
		
		//Clear the text
		
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[4]/input")).clear();
		
		//Confirm that edit field is disabled
		
		boolean fieldDisabled = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[5]/input")).isEnabled();
		
		if (!fieldDisabled) {
			System.out.println("Selected field is disabled");
		} else System.out.println("Selected field is enabled");
	}

}
