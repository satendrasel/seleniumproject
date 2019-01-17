package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keytest3 {
	/*program to work with doble click operation,ctrl+c, ctrl+v*/
	public static void main(String[] args) {
FirefoxDriver d3= new FirefoxDriver();
d3.manage().window().maximize();
d3.get("http://satendra-pc:8080/login.do");
WebElement userwb= d3.findElement(By.name("username"));
userwb.sendKeys("admin");
Actions act= new Actions(d3);
act.doubleClick(userwb).perform();
act.sendKeys(Keys.chord(Keys.CONTROL,"C")).perform();
act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.chord(Keys.CONTROL,"V")).perform();

	}

}
