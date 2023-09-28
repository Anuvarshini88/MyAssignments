package week1.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {



	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		System.out.println(driver.findElement(By.tagName("h2")).getText());
		driver.findElement(By.linkText("CRM/SFA")).click();

		System.out.println(driver.getTitle());

		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		Thread.sleep(2000);
		String acnt_name = "Anu Varshini";
		driver.findElement(By.id("accountName")).sendKeys(acnt_name);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		WebElement dd_industry = driver.findElement(By.name("industryEnumId"));
		Select industry = new Select(dd_industry);
		industry.selectByValue("IND_SOFTWARE");

		WebElement dd_ownership = driver.findElement(By.name("ownershipEnumId"));
		Select ownership = new Select(dd_ownership);
		ownership.selectByVisibleText("S-Corporation");

		WebElement dd_source = driver.findElement(By.id("dataSourceId"));
		Select source = new Select(dd_source);
		source.selectByValue("LEAD_EMPLOYEE");



		WebElement dd_marketingcamp = driver.findElement(By.id("marketingCampaignId"));
		Select marketingcamp = new Select(dd_marketingcamp);
		marketingcamp.selectByIndex(5);

		WebElement dd_state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state = new Select(dd_state);
		state.selectByValue("TX");

		WebElement btn_CreateAcnt = driver.findElement(By.className("smallSubmit"));
		btn_CreateAcnt.submit();

		//		WebElement duplicateError = driver.findElement(By.linkText("Anu Varshini (12693)"));
		//		if(duplicateError.equals("Anu Varshini (12693)")) {
		//			WebElement btn_CreateDupAcnt = driver.findElement(By.className("buttonDangerous"));
		//			if(btn_CreateDupAcnt.isDisplayed()) {		
		//				btn_CreateDupAcnt.submit();
		//			}

		String accntName = driver.findElement(By.partialLinkText("Anu Varshini")).getText();
		System.out.println(accntName);
		if(accntName.contains(acnt_name)) {

			System.out.println("The account name is correct");
		}else
			System.out.println("The account name is not correct");
		driver.close();
	}

}

