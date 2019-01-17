package windowhandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiplewindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","c:\\server\\chromedriver.exe");
		WebDriver d4= new ChromeDriver();
		d4.get("https://www.irctc.co.in");
		d4.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement wb =d4.findElement(By.linkText("TOURIST TRAIN"));
Actions act = new Actions(d4);
act.moveToElement(wb).perform();
act.moveToElement(d4.findElement(By.linkText("irctctourism"))).perform();
act.moveToElement(d4.findElement(By.linkText("Air Tours"))).perform();
Set<String>S=d4.getWindowHandles();
System.out.println(S);

Iterator<String>it =S.iterator();
String parentid =it.next();
String childid =it.next();

d4.switchTo().window(childid);
String childTitle =d4.getTitle();
System.out.println(childTitle);
Thread.sleep(500);
d4.close();

d4.switchTo().window(parentid);
String parentTitle =d4.getTitle();
System.out.println(parentTitle);
d4.close();
System.out.println(d4.getCurrentUrl());
}

		
	}


