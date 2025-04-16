package Package2;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {
	XSSFSheet sh;
	public Excel1()throws IOException{
		FileInputStream f =new FileInputStream("C:\\Users\\Meenu D Kumar\\Desktop\\Excel.xlsx");
		XSSFWorkbook w =new XSSFWorkbook(f);
		sh =w.getSheet("Sheet1");
		
	}
	public String readData(int i,int j) {
		Row r= sh.getRow(i);
		Cell c=r.getCell(j);
		int celltype=c.getCellType();
		switch(celltype) {
		case Cell.CELL_TYPE_NUMERIC:{
			double a =c.getNumericCellValue();
			return String.valueOf(a);
		}
		case Cell.CELL_TYPE_STRING:{
			return c.getStringCellValue();
			
		}
		
	
		
	}
		return null;
		

	}
}
