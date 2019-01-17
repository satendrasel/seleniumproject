package complexxpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoocapature10topnews {

	public static void main(String[] args) {
		
			WebDriver driver =new FirefoxDriver();
			driver.get("https://www.yahoo.com");
			String x ="//li[@class ='Mb-12 Ell']";
					//"//li[@class ='trending-list selected']/ul/li[*]/a/span[2]";
			List<WebElement>lst= driver.findElements(By.xpath(x));
			//get the link count
			System.out.println(lst.size());
			
	// display all the link news
			for(WebElement wb:lst) {
				String linkName =wb.getText();
				System.out.println(linkName);
			}
	}

}
