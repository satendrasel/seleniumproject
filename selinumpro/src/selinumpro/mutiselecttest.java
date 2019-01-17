package selinumpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class mutiselecttest {

	public static void main(String[] args) {
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("file:///C:/Users/satendra/Desktop/course.html");
		WebElement mwb=driver1.findElement(By.name("sel"));
		Select s1= new Select(mwb);
		List<WebElement> allOptions = s1.getOptions();
		System.out.println(allOptions.size());
		
		for (WebElement we : allOptions)
		{
		System.out.println(we.getText());
		}
		
		
		
	
	
	}

}
