package selinumpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Alteranatevalue {

	public static void main(String[] args) {
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("file:///C:/Users/satendra/Desktop/course.html");WebElement mwb=driver1.findElement(By.name("sel"));
		Select sel= new Select(mwb);
		List<WebElement> allOptions = sel.getOptions();
		int i=0;
		for(WebElement wb:allOptions) {
			String actValue=wb.getText();
			if(i%2==0) {
				sel.selectByVisibleText(actValue);
			}
			i++;
		}
	}

}
