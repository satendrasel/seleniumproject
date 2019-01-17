package complexxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Capaturepriceiphone7 {

	public static void main(String[] args) {
		WebDriver d1 = new FirefoxDriver();
		d1.manage().window().maximize();
		d1.get("https://www.flipkart.com/");
		d1.findElement(By.xpath("//button[text()='✕']")).click();
		d1.findElement(By.name("q")).sendKeys("iphone7");
		Actions Act = new Actions(d1);
		Act.sendKeys(Keys.ENTER).perform();
		String P ="//div[text()='Apple iPhone 7 Plus (Jet Black, 128 GB)']/../../div[2]/div[1]/div/div[1]";
String price =d1.findElement(By.xpath(P)).getText();
System.out.println(price);
	}

}
