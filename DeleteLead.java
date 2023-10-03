package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
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
	
	public void clk_FindLeads() {
		
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
	}
	
	public void clk_phonetab() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'col-partyId')]/a[@class='linktext'])[1]")).click();
		
	}
	public void clk_delete() {
		
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		System.out.println(driver.getTitle());
	}
	
	public void closeBrowser() {
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		
		DeleteLead deletelead = new DeleteLead();
		deletelead.getURL();
		deletelead.login();
		deletelead.clickCRMSFAlink();
		deletelead.clkLeads();
		deletelead.clk_FindLeads();
		deletelead.clk_phonetab();
		deletelead.clk_delete();
		deletelead.closeBrowser();
	}

}
