package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAss1_2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		//Go to Home Page
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		if (driver.getTitle().equals("TestLeaf - Selenium Playground"))
			System.out.println("Reached Home");
		driver.findElement(By.linkText("HyperLink")).click();
		
		//Find where am supposed to go without clicking me?
		
		String linkVal = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"))
				.getAttribute("href");
		driver.get(linkVal);
		if (driver.getTitle().contains("Button"))
			System.out.println("Supposed to go button page");
		else
			System.out.println("Page does not exists");
		
		//Verify am I broken?
		
		driver.findElement(By.id("home")).click();
		driver.findElement(By.linkText("HyperLink")).click();
		
		String hrefVal = driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href");
		driver.get(hrefVal);		
		if(driver.getTitle().contains("404")) {
			System.out.println("Page is broken");
		} else System.out.println(driver.getTitle());
		
		driver.get("http://leafground.com/pages/Link.html");
		
		//Go to Home Page (Interact with same link name)
		
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
		if (driver.getTitle().equals("TestLeaf - Selenium Playground"))
			System.out.println("Reached Home Again");
		
//		How many links are available in this page?
				
		driver.findElement(By.linkText("HyperLink")).click();
		
		int noOfLinks = driver.findElements(By.xpath("//div[@class='large-6 small-12 columns']/a")).size();
		System.out.println("No of links in the page: "+noOfLinks);
		
		//Go to Home Page (Interact with same link name)
		
		String linkVal1 = driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).getAttribute("href");
		String linkVal2 = driver.findElement(By.linkText("Go to Home Page")).getAttribute("href");
		if(linkVal1.equals(linkVal2)) {
			driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
		String titleHomPage = driver.getTitle();
		System.out.println(titleHomPage);
		}
		else System.out.println("HREF not matched");
		driver.close();
		

	}
}
