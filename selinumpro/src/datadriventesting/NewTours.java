package datadriventesting;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTours {

	public static void main(String[] args) throws IOException {
		WebDriver dr =new FirefoxDriver();
		dr.get("http://www.newtours.demoaut.com");
		//http://www.newtours.demoaut.com/
		
		FileInputStream fls = new FileInputStream("C:\\Users\\satendra\\Desktop\\test1.xlsx");
		Workbook wb = WorkbookFactory.create(fls);
		Sheet sh1 =wb.getSheet("Sheet1");
		int noofrow =sh1.getLastRowNum();
		System.out.println("no. of record in exel sheet: "+noofrow);
		for(int i=1;i<=noofrow;i++) {
			Row current_row = sh1.getRow(i);
			System.out.println(i);
			String First_Name =current_row.getCell(0).getStringCellValue();
			String Last_Name =current_row.getCell(1).getStringCellValue();
			String Phone =current_row.getCell(2).getStringCellValue();
			String Email =current_row.getCell(3).getStringCellValue();
			String Address =current_row.getCell(4).getStringCellValue();
			String City =current_row.getCell(5).getStringCellValue();
			String State =current_row.getCell(6).getStringCellValue();
			String PostelCode =current_row.getCell(7).getStringCellValue();
			String Country =current_row.getCell(8).getStringCellValue();
			String UserName =current_row.getCell(9).getStringCellValue();
			String Password =current_row.getCell(10).getStringCellValue();
			
			dr.findElement(By.linkText("REGISTER")).click();
			// entering Contact Information
			dr.findElement(By.name("firstName")).sendKeys("First_Name");
			dr.findElement(By.name("lastName")).sendKeys("Last_Name");
			dr.findElement(By.name("phone")).sendKeys("Phone");
			dr.findElement(By.name("userName")).sendKeys("Email");
			// entering Mailing Information
			dr.findElement(By.name("address1")).sendKeys("Address");
			dr.findElement(By.name("address2")).sendKeys("Address");
			dr.findElement(By.name("city")).sendKeys("City");
			dr.findElement(By.name("state")).sendKeys("State");
			dr.findElement(By.name("postalCode")).sendKeys("PostelCode");
			// country selection 
			Select dropcountry =new Select(dr.findElement(By.name("country")));
			dropcountry.selectByVisibleText(Country);
			//entering User Information 
			dr.findElement(By.name("email")).sendKeys("UserName");
			dr.findElement(By.name("password")).sendKeys("Password");
			dr.findElement(By.name("confirmPassword")).sendKeys("Password");
			//enter the regist button
			dr.findElement(By.name("register")).click();
		}
		if(dr.getPageSource().contains("Thank you for registering")) {
			System.out.println("Registration completed for " +"i"+  " record ");
		}else {
			System.out.println("Registration failed for " +"i"+  " record ");
		}
		

	}

}
