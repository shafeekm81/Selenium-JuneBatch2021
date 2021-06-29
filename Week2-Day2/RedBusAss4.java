package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusAss4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement sourcePlac = driver.findElement(By.xpath("//input[@id='src']"));
		sourcePlac.sendKeys("Chennai");
		Thread.sleep(2000);
		sourcePlac.sendKeys(Keys.TAB);

//		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.ENTER);

		WebElement destPlace = driver.findElement(By.xpath("//input[@id='dest']"));
		destPlace.sendKeys("Bengaluru");
		Thread.sleep(2000);
		destPlace.sendKeys(Keys.TAB);

//		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//td[@class='next']")).click();
		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//tr[5]/td[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("close")).click();
		String searchBus = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		String totBus = searchBus.replaceAll("\\D", "");
		System.out.println("Number of Search Results: " + totBus);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
		Thread.sleep(30000);

		driver.findElement(By.xpath("//label[@for='bt_SLEEPER']")).click();
		Thread.sleep(2000);
		String searchBusSleeper = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		String totBusSleeper = searchBusSleeper.replaceAll("\\D", "");
		System.out.println("Number of Search Results for SLEEPER: " + totBusSleeper);

		driver.findElement(By.xpath("//label[@for='bt_AC']")).click();
		Thread.sleep(2000);
		String searchBusAC = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		String totBusAC = searchBusAC.replaceAll("\\D", "");
		System.out.println("Number of Search Results for AC: " + totBusAC);

		driver.close();

	}

}
