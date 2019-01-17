package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keytest2 {
/*program to work with auto suggest edit box*/
	public static void main(String[] args) {
		FirefoxDriver driver1= new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver1.get("https://www.google.com");
		//type data in auto suggest edit box
		driver1.findElement(By.name("q")).sendKeys("qspiders");
		//click on suggested element
		driver1.findElement(By.xpath("//b[text()=' mysore']")).click();
	}

}
