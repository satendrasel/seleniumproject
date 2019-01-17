package selinumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownselect {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	WebElement wnl =driver.findElement(By.id("month"));
	//create a object to select class
	Select sel = new Select(wnl);
// Select the value using Select sel
	sel.selectByVisibleText("Dec");
	WebElement wnl2 =driver.findElement(By.id("day"));
	Select S2 = new Select(wnl2);
	S2.selectByVisibleText("2");
	S2.selectByIndex(0);
	//S2.selectByValue("2");
	
	WebElement yElement =driver.findElement(By.id("year"));
	Select S3 = new Select(yElement);
	
	
	}

}
