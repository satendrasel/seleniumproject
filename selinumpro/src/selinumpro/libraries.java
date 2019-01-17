package selinumpro;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class libraries {
	
		public void Select(WebElement dElement,String data) {
			Select sel = new Select(dElement);
			sel.selectByVisibleText(data);
		}
		public void Select(WebElement dElement,int index) {
			Select sel = new Select(dElement);
			sel.selectByIndex(index);
		}

	}

