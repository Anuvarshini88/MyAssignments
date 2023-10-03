package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	ChromeDriver driver=new ChromeDriver();



	public void getURL() {

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	}


	public void login() {

		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
	}


	public void clickCRMSFAlink() {

		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	public void clkLeads() throws InterruptedException


	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Leads')])[1]")).click();
		Thread.sleep(2000);

	}

	public void createLead() throws InterruptedException {

		String acnt_name = "Anu Varshini";
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Anuvarshini");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Anu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("GS");
		driver.findElement(By.xpath("(//input[@name='lastNameLocal'])")).sendKeys("AnuGS");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description entered");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Anuvarshini88@gmail.com");
		WebElement dd_state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(dd_state);
		state.selectByVisibleText("Connecticut");
		Thread.sleep(2000);

	}
	public void btn_CreateLead() {

		driver.findElement(By.className("smallSubmit")).click();

	}
	public void clk_Edit() {


		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();


	}
	public void clr_Description() {

		driver.findElement(By.id("updateLeadForm_description")).clear();
	}

	public void clk_Update() {

		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
	}

	public void gettitleEdit() {

		System.out.println(driver.getTitle());
	}


	public void closeBrowser() {
		driver.close();
	}



	public static void main(String[] args) throws InterruptedException {
		EditLead editlead = new EditLead();
		editlead.getURL();
		editlead.login();
		editlead.clickCRMSFAlink();
		editlead.clkLeads();
		editlead.createLead();
		editlead.btn_CreateLead();
		editlead.clk_Edit();
		editlead.clr_Description();
		editlead.clk_Update();
		editlead.gettitleEdit();
		editlead.closeBrowser();


	}

}
