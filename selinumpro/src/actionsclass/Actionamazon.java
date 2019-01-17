package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionamazon {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.com/");
Actions act = new Actions(d);
WebElement wb =d.findElement(By.cssSelector("a[id='nav-link-accountList']"));
act.moveToElement(d.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
act.moveToElement(wb).contextClick().build().perform();
	}

}
