package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {
ChromeDriver driver = new ChromeDriver();

public void getURl() {
	
	driver.get(" https://leafground.com/button.xhtml");
	driver.manage().window().maximize();
	
}
public void confirmTitlebtn() {
	
	WebElement element = driver.findElement(By.xpath("//h5[contains(text(),'Click and Confirm title.')]"));
	System.out.println(element.getText());
	driver.findElement(By.xpath("//span[contains(text(),'Click')]")).click();
	System.out.println(driver.getTitle());
}

public void confirmTitlebtnVisibility() {
	driver.navigate().back();
	WebElement element = driver.findElement(By.xpath("//button[@disabled='disabled']"));
	boolean enabled = element.isEnabled();
	System.out.println("Btn visibility - " + enabled);
	
}
public void btnposition() {
	
	System.out.println(driver.findElement(By.xpath("(//span[contains(text(),'Submit')])[1]")).getLocation());
	
	
}

public void btnoColour() {
	String btncolor1 = driver.findElement(By.xpath("//span[contains(text(),'Save')]")).getCssValue("background-color");
	String btncolor2 = driver.findElement(By.xpath("//span[contains(text(),'Save')]")).getCssValue("color");
	System.out.println(btncolor1);
	System.out.println(btncolor2);
}

public void btnHeight() {

	Dimension size = driver.findElement(By.xpath("(//span[contains(text(),'Submit')])[2]")).getSize();
	System.out.println("height is - " +size);
}
public void closebrowser() {
	driver.close();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeafgroundButton btnreading = new LeafgroundButton();
		btnreading.getURl();
		btnreading.confirmTitlebtn();
		btnreading.confirmTitlebtnVisibility();
		btnreading.btnposition();
		btnreading.btnoColour();
		btnreading.btnHeight();
		btnreading.closebrowser();
	}

}
