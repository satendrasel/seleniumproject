package complexxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkartinventory {

	public static void main(String[] args) {
		FirefoxDriver d1 = new FirefoxDriver();
		d1.get("https://www.flipkart.com");
		d1.findElement(By.xpath("//button[text()='✕']")).click();
		
	d1.findElement(By.name("q")).sendKeys("iphone moblies",Keys.ENTER);
	String s ="//span[contains(text(),'Showing')]";
String Result= d1.findElement(By.xpath(s)).getText();
System.out.println(Result);
String[] arr =Result.split(" ");
String countstr =arr[5];
System.out.println(countstr);
int inCount = Integer.parseInt(countstr);
System.out.println(inCount);
	}

}
