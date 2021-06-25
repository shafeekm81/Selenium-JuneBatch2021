package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAss1_3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		
		//Click on this image to go home page
		
		driver.findElement(By.xpath("//label[@for='home']/following::img[1]")).click();
		if (driver.getTitle().equals("TestLeaf - Selenium Playground"))
			System.out.println("Reached Home");
		driver.findElement(By.linkText("Image")).click();
		
//		Am I Broken Image?
		
		String srcVal = driver.findElementByXPath("//label[@for='position']/following::img").getAttribute("src");
		driver.get(srcVal);
		if (driver.getTitle().contains("404")) {
			System.out.println("Image is Broken");
		}
		
//		Click me using Keyboard or Mouse
		
		driver.get(" http://leafground.com/pages/Image.html");
//		driver.findElement(By.xpath("//label[@for='position']/following::img[2]")) keyboard/mouse action class not completed

		driver.close();
	}

}
