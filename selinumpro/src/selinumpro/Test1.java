package selinumpro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("java code test");
		WebDriver d = new FirefoxDriver();
d.get("http://gmail.com");
String Pagetitle = d.getTitle();
System.out.println("Pagetitle");

String Pageurl = d.getCurrentUrl();
System.out.println("Pageurl");

String htmlcode =d.getPageSource();
System.out.println("htmlcode");

d.close();
	}

}
