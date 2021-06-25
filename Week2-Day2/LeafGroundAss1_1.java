package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAss1_1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Button.html");

		driver.manage().window().maximize();
		
		//Click button to travel home page
		
		driver.findElement(By.id("home")).click();
		
		if(driver.getTitle().equals("TestLeaf - Selenium Playground"))
			System.out.println("Reached Home");
		
		driver.findElement(By.xpath("//a[@class='wp-categories-link maxheight']/following::a")).click();
		
		//Find position of button (x,y)
		
		Point locateXy = driver.findElement(By.id("position")).getLocation();
		System.out.println(locateXy);
		
		//Find button color
		
		String boxColor = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color");
		System.out.println(boxColor);
		
		//Find the height and width
		
		System.out.println(driver.findElement(By.id("size")).getSize());

	}

}
