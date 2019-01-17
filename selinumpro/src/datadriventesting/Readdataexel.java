package datadriventesting;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdataexel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\satendra\\Desktop\\sales.xlsx");
		Workbook wb =WorkbookFactory.create(fis);
		Sheet sh= wb.getSheet("Sheet2");//providing the sheetname
		//Row rw = sh.getRow(arg0)
		int rowcount  =sh.getLastRowNum(); // return the rows count
		int columncount =sh.getRow(0).getLastCellNum(); // returns thecolumn count or cell
		
		for(int i=0;i<=rowcount;i++) {
			Row currentrow =sh.getRow(i); //focus on current row
			for(int j=0;j<columncount;j++) {
			String Cellvalue = currentrow.getCell(j).toString(); // read the value from a cell
			System.out.print("  "  +Cellvalue);
			}
			System.out.println();
		}
	}

}
