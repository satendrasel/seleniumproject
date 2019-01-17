package selinumpro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import selinumpro.libraries;
public class Dropdowntestgen {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		libraries lib = new libraries();
		
		WebElement dayElement =driver.findElement(By.id("day"));
		lib.Select(dayElement, "2a");
		
		WebElement mElement =driver.findElement(By.id("month"));
		lib.Select(mElement, "12");
		
		WebElement yElement =driver.findElement(By.id("year"));
		lib.Select(yElement, "1947");
		
	}

}
