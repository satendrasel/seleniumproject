package windowhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ResumeUplaod {

	public static void main(String[] args) throws Throwable {
		WebDriver d= new FirefoxDriver();
		d.get("https://my.naukri.com/account/register/basicdetails");
d.findElement(By.name("userType")).click();
d.findElement(By.name("uploadCV")).click();
Thread.sleep(200);
Runtime.getRuntime().exec("C:\\Users\\satendra\\desktop\\simmi.exe");
	}

}
