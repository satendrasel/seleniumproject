package datadriventesting;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Testfd {

	public static void main(String[] args) throws IOException {
		WebDriver d= new FirefoxDriver();
		d.manage().window().maximize();
d.get("https://www.moneycontrol.com/fixed-income/calculator/fixed-deposit-calculator.html");
FileInputStream fls = new FileInputStream("C:\\Users\\satendra\\Desktop\\Calculator.xlsx");
Workbook wb = WorkbookFactory.create(fls);
Sheet sh =wb.getSheet("Sheet1");
int rowcount =sh.getLastRowNum();
for(int i=1;i<=rowcount;i++) {
	Row row = sh.getRow(i);
	
	/*Cell Prcell =row.getCell(0);
	int princ = (int)Prcell.getNumericCellValue();*/
	int princ =(int)row.getCell(0).getNumericCellValue();
	
	Cell Roi =row.getCell(1);
	int rateofinterest =(int)Roi.getNumericCellValue();
	
	Cell period =row.getCell(2);
	int Peri =(int)period.getNumericCellValue();
	
	Cell frequency =row.getCell(3);
	String freq = frequency.getStringCellValue();
	
	Cell Maturirtyvalue =row.getCell(4);
	int Exp_mvalue =(int)Maturirtyvalue.getNumericCellValue();
	
	d.findElement(By.id("principal")).sendKeys(String.valueOf(princ));
	d.findElement(By.id("interest")).sendKeys(String.valueOf(rateofinterest));
	d.findElement(By.id("tenure")).sendKeys(String.valueOf(Peri));
	
	Select dropdown = new Select(d.findElement(By.id("tenurePeriod")));
	dropdown.selectByVisibleText("year(s)");
	
	Select fdropdown =new Select(d.findElement(By.id("frequency")));
	fdropdown.selectByVisibleText(freq);
	
	d.findElement(By.xpath("//*[@id='fdMatVal']/div[2]/a[1]/img")).click();
	String actual_mvalue =d.findElement(By.xpath("//*[@id='resp_matval']/strong")).getText();
	
	if( (Double.parseDouble(actual_mvalue)==Exp_mvalue))
			{
		System.out.println("test pass");
			}
	else {
		System.out.println("test fail");
	}
	d.findElement(By.xpath("//*[@id='fdMatVal']/div[2]/a[2]/img")).click();
}
d.close();
d.quit();
	}

}
