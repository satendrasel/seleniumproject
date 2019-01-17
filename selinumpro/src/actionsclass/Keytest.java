package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//driver.get("https://www.amazon.com");
//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
/*     driver.get("http://seleniumsubbu.blogspot.in/");
driver.findElement(By.name("q")).sendKeys("selenium");
Thread.sleep(3000);
driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
*/

public class Keytest {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://www.google.com/");
					driver.findElement(By.name("q")).sendKeys("qspider address");
					Actions act = new Actions(driver);
					act.sendKeys(Keys.ENTER).perform();
					act.sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD)).perform();
					WebElement e1 =driver.findElement(By.id("lu_map"));
					act.contextClick(e1).perform();
					act.sendKeys("w").perform();
					//driver.quit();
					
	}

}
