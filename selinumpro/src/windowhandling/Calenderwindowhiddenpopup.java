package windowhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calenderwindowhiddenpopup {

	public static void main(String[] args) {
		WebDriver d2= new FirefoxDriver();
	d2.get("https://www.redbus.in/");	
	d2.findElement(By.xpath("//label[text()='Onward Date']")).click();
	
	while(true) {
		try {
			d2.findElement(By.xpath("//td[text()='Dec 2019']"));
			String x = "//div[@id='rb-calendar_onward_cal']"
			           + "/descendant::td[text()='29']";
			d2.findElement(By.xpath(x)).click();
			break;
			
		} catch (Throwable t) {
			String x1= "//div[@id='rb-calendar_onward_cal']/descendant::button[text()='>']";
			           	d2.findElement(By.xpath(x1)).click();
		}
	}

	}

}
