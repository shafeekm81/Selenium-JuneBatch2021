package week2.day1;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDupLeadAss1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		String homePageTitle = driver.getTitle();
		System.out.println(homePageTitle);
		driver.findElementByLinkText("CRM/SFA").click();
//		String secondPageTitle = driver.getTitle();
//		System.out.println(secondPageTitle);
		driver.findElementByLinkText("Leads").click();
//		String leadPageTitle = driver.getTitle();
//		System.out.println(leadPageTitle);
		driver.findElementByLinkText("Create Lead").click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeafII");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ShafeekII");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("MohamedII");
		WebElement srcDrpDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpDown = new Select(srcDrpDown);
		drpDown.selectByValue("LEAD_CONFERENCE");
		WebElement mrkDrpDown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpDown2 = new Select(mrkDrpDown);
		drpDown2.selectByValue("CATRQ_AUTOMOBILE");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("MalikI");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("MohammedI");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Hi");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("06/25/81");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Admin");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("600000");
		WebElement crcyDrpDown = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select drpDown3 = new Select(crcyDrpDown);
		drpDown3.selectByValue("INR");
		WebElement indDrpDwn = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drpDown4 = new Select(indDrpDwn);
		drpDown4.selectByVisibleText("Distribution");
		WebElement ownDrpDwn = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drpDown6 = new Select(ownDrpDwn);
		drpDown6.selectByIndex(3);
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("500");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("SIC111");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("T");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Home Assessment for Week2Day1");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Selenium Learning");

		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("IND");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("001");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9999999991");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("1231");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shafeekm@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Email");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.shafeekTest.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("shafeek");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Account Dept");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Street I");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Street II");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600001");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("0101");

		WebElement geoDrpDwn = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drpDown7 = new Select(geoDrpDwn);
		drpDown7.selectByValue("IND");

		Thread.sleep(200);

		WebElement statDrpDwn = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drpDown8 = new Select(statDrpDwn);
		drpDown8.selectByValue("IN-TN");

		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeafIII");
		driver.findElement(By.name("submitButton")).click();
		String dupCompVal = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String repVal = dupCompVal.replaceAll("\\d", "").replaceAll("\\s", "").replaceAll("[()]", "");
//		System.out.println(repVal);
		if (repVal.equals("TestLeafIII")) {
			System.out.println("Duplicate company updated as expected");
		} else
			System.out.println("Mismatch");

		driver.close();

	}

}
