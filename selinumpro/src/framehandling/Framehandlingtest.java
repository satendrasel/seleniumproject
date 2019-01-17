package framehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framehandlingtest {
	public static void main(String[] args) {
	WebDriver d1= new FirefoxDriver();
d1.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
//pass driver control to frame2
d1.switchTo().frame("classFrame");
//click on link when link present in frame 3
d1.findElement(By.linkText("com.thoughtworks.selenium")).click();
//pass control back to main window
d1.switchTo().defaultContent();
// pass driver control to frame 3
d1.switchTo().frame("packageFrame");
d1.findElement(By.linkText("Actions")).click();
d1.switchTo().parentFrame();
	}

}
