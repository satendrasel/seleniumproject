package windowhandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertwindows {

	public static void main(String[] args) {
WebDriver d = new FirefoxDriver();
		/*System.setProperty("webdriver.chrome.driver","c:\\server\\chromedriver.exe");
		WebDriver d= new ChromeDriver();*/
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
d.get("https://www.irctc.co.in");
d.findElement(By.id("loginText")).click();

Alert act =d.switchTo().alert();
System.out.println(act.getText());
act.accept();
d.findElement(By.name("userId")).sendKeys("admin");

	}

}
