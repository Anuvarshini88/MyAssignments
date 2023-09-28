package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {
	ChromeDriver driver = new ChromeDriver();
	public void loadURl() {
		
		
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	public void signUpPopup() {
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Anu");
		driver.findElement(By.name("lastname")).sendKeys("Gs");
		driver.findElement(By.name("reg_email__")).sendKeys("Anuvarshini88@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Welcome@123");
	}
	
	public void dob() {
		
		WebElement dd_bday = driver.findElement(By.name("birthday_day"));
		Select bday = new Select(dd_bday);
		bday.selectByValue("27");
		
		WebElement dd_month = driver.findElement(By.name("birthday_month"));
		Select month = new Select(dd_month);
		month.selectByVisibleText("Jul");
		
		WebElement dd_year = driver.findElement(By.name("birthday_year"));
		Select year = new Select(dd_year);
		year.selectByIndex(5);
		
	}
	
	public void gender() {
		
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacebookSignUp signup = new FacebookSignUp();
		
		signup.loadURl();
		signup.signUpPopup();
		signup.dob();
		signup.gender();
		
	}

}
