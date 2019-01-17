package multiplebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Doubleclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\server\\chromedriver.exe");
WebDriver d4= new ChromeDriver();
d4.get("http://satendra-pc:8080/login.do");
d4.findElement(By.name("username")).sendKeys("admin");
d4.findElement(By.name("pwd")).sendKeys("manager");
d4.findElement(By.id("loginButton")).click();
	}

}
