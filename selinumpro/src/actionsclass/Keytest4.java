package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keytest4 {

	public static void main(String[] args) {
FirefoxDriver d4 = new 	FirefoxDriver();
d4.manage().window().maximize();
d4.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
WebElement srcE = d4.findElement(By.id("draggable"));
WebElement dstE = d4.findElement(By.id("droptarget"));
Actions act = new Actions(d4);

act.dragAndDrop( srcE,dstE).perform();

String actText=dstE.getText();
if(actText.equals("You did great!")) {
	System.out.println("Pass");
} else {
	System.out.println("fail");
}

	}

}
