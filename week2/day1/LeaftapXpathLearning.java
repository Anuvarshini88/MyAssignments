package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapXpathLearning {

	ChromeDriver driver = new ChromeDriver();


	public void getUrl() {

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	}
	public void login() {
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
	}
	public void closeBrowser() {
		driver.close();
	}


	public static void main(String[] args) {
		LeaftapXpathLearning xpath = new LeaftapXpathLearning();
		xpath.getUrl();
		xpath.login();
		xpath.closeBrowser();


	}

}
