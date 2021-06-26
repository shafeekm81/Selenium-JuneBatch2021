package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsAss2 {

	public static void main(String[] args) throws InterruptedException {

		String newCompany = "Home CompanyUpdate";

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Gopi");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//td)//a")).click();

		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		String leadEditPAge = driver.getTitle();
		System.out.println("Selected company page title: " + leadEditPAge);
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(newCompany);
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		String updCompanyName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		String repVal = updCompanyName.replaceAll("\\d", "").replaceAll("[()]", "");

		if (repVal.contains(newCompany))
			System.out.println("Company Name is " + repVal + " and modified as expected");
		else
			System.out.println("Updated company mismatch");
		
		System.out.println(newCompany);
		System.out.println(repVal);

		driver.close();
	}

}
