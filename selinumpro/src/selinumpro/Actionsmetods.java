package selinumpro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsmetods {

	public static void main(String[] args) {
	FirefoxDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("http://amazon.com");
WebElement wbl =driver.findElement(By.xpath("//span[@text()='Departments']"));
Actions act = new Actions(driver);
act.moveToElement(wbl);
act.perform();
driver.findElement(By.linkText("full store directory")).click();
	}

}
