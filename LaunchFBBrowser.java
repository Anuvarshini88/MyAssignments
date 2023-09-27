package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFBBrowser {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		driver.findElement((By.linkText("Find your account and log in."))).click();

		if(driver.getTitle().equals("Forgot password | Can't log in | Facebook")){
			System.out.println("Title printed correctly");	
		}else
			System.out.println("Facebook login Page title does not match");

		driver.close();









	}

}
