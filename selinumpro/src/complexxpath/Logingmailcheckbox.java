package complexxpath;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logingmailcheckbox {

	public static void main(String[] args) {
	WebDriver d4 = new FirefoxDriver();
	d4.get("https://www.gmail.com");
	d4.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
d4.findElement(By.id("identifierId")).sendKeys("yadavsatendra020");
d4.findElement(By.xpath("//span[text()='Next']")).click();
d4.findElement(By.name("password")).sendKeys("SATTU@1987");
d4.findElement(By.xpath("//span[text()='Next']")).click();
String s ="//div[@class='Cp']/div[1]/table/tbody/tr[*]/td[2]/div";
List<WebElement>lst =d4.findElements(By.xpath(s));
// click the all the checkbox
for(WebElement wb:lst) {
	wb.click();
}
System.out.println("------------------------");

List<WebElement>lst1 =d4.findElements(By.xpath(s));
int i=0;
for(WebElement wb:lst1) {
	String val= wb.getAttribute("aria-checked");
	if(val.equals("true")) {
		System.out.println("++i''===Selected");	
	} else {
		System.out.println(" not selected");	
	}
}
	}
	
	
}
