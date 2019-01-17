package complexxpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capaturealllinkes {

	public static void main(String[] args) {
		FirefoxDriver d2 = new FirefoxDriver();
d2.get("https://www.irctc.co.in");
List<WebElement> lst=d2.findElements(By.tagName("a"));
System.out.println(lst.size());
//display all the linkname
for(int i=0; i<lst.size();i++) {
	String Linkname= lst.get(i).getText();
	System.out.println(Linkname);
}
	}

}
