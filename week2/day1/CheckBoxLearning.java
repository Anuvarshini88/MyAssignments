package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxLearning {

	ChromeDriver driver = new ChromeDriver();

	public void getURl() {

		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void basic_Checkbox() {

		driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[1]")).click();
	}

	public void ajax_Checkbox() throws InterruptedException {

		driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[2]")).click();
		boolean displayed = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).isDisplayed();
		if(displayed) {
			System.out.println("checked notification is displayed");
		}else
			System.out.println("checked notification is not displayed");
		
		System.out.println(driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText());
		Thread.sleep(2000);
		
	}

	public void lang_Checkbox() {

		driver.findElement(By.xpath("(//label[contains(text(),'Java')])[1]")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'Javascript')])[1]")).click();
	}


	public void tristate_Checkbox() {
		WebElement tristateCb = driver.findElement(By.xpath("//div[contains(@id,'ajaxTriState')]"));
		tristateCb.click();
		boolean flag = tristateCb.isSelected();
		if(flag) {
			System.out.println("Checkbox checked");
		}else
		{
			System.out.println("Checkbox unchecked");
		}
		WebElement tristateCb1 = driver.findElement(By.xpath("//div[contains(@id,'ajaxTriState')]"));
		boolean flag1 = tristateCb1.isSelected();
		if(flag1) {
			System.out.println("Checkbox checked");
		}else
		{
			System.out.println("Checkbox unchecked");
		}
	}

	public void toggle_checkbox() {
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();

	}

	public void chk_disabled() {

		boolean flag = driver.findElement(By.xpath("//input[@aria-label='Disabled']")).isEnabled();
		if(flag) {
			System.out.println("chkbox enabled");
		}else
			System.out.println("chkbox disabled");
	}

	public void multiselect() {
		
		driver.findElement(By.xpath("(//div[contains(@id,'j_idt87:multiple')])[1]")).click();
		
		driver.findElement(By.xpath("//input[@aria-label='Filter Input']")).sendKeys("Istanbul");
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-icon ui-icon ui-icon-blank'])[5]")).click();
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CheckBoxLearning ckb = new CheckBoxLearning();
		ckb.getURl();
		ckb.basic_Checkbox();
		ckb.ajax_Checkbox();
		ckb.lang_Checkbox();
		ckb.tristate_Checkbox();
		ckb.toggle_checkbox();
		ckb.chk_disabled();
		ckb.multiselect();
	}

}
