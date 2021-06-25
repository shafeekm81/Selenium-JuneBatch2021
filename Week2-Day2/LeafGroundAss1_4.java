package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAss1_4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		//select training program by index

		WebElement selectList = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select listVal = new Select(selectList);
		listVal.selectByIndex(4);
		
		//select training program by Text

		WebElement selectList1 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select listVal1 = new Select(selectList1);
		listVal1.selectByVisibleText("Appium");
		
		//select training program by Value

		WebElement selectList2 = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Select listVal2 = new Select(selectList2);
		listVal2.selectByValue("3");
		
		//Get the number of drop down options

		WebElement tot = driver.findElement(By.xpath("//div[@class='example'][4]/select"));
		Select numOptions = new Select(tot);

		int noOfDrpDowns = numOptions.getOptions().size();

		System.out.println("No of DropDown Values: " + noOfDrpDowns);
		
		//You can also use sendkeys to select

		driver.findElement(By.xpath("//select[@class='dropdown']/following::select[1]")).sendKeys("Selenium");
		
		//Select your programs

		WebElement drpDown1 = driver.findElement(By.xpath("//select[@class='dropdown']/following::select[2]"));
		Select selVal1 = new Select(drpDown1);
		selVal1.selectByValue("1");
		selVal1.selectByValue("3");

//		driver.close();

	}

}
