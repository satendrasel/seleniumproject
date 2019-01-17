package windowhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.browserlaunchers.locators.BrowserLocator;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Filedownloadtest {

	public static void main(String[] args) {
FirefoxProfile pr =new FirefoxProfile();
pr.setPreference("browser.download.folderlist", 2);
pr.setPreference("browser.helperApps.Neverask.SaveToDisk","application/zip");
pr.setPreference("browser.download.dir","D:\\get\\");

WebDriver d =new FirefoxDriver(pr);
d.get("https://www.apache.org/dyn/closer.lua/poi/release/bin/poi-bin-3.17-20170915.zip");

d.findElement(By.linkText("http://archive.apache.org/dist/poi/release/bin/poi-bin-3.17-20170915.zip")).click();
//d.findElement(By.linkText("http://www-us.apache.org/dist/poi/release/bin/poi-bin-3.17-20170915.zip")).click();
	}

}
