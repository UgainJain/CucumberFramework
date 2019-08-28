package utils.dataSource;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {

public String exceldata(String sheetname,int rownum,int colmn) throws IOException, EncryptedDocumentException, InvalidFormatException {
	String excelpath = LoadProperty.getvar("excelfilepath", "config");
	excelpath = System.getProperty("user.dir")+excelpath;
	FileInputStream fis = new FileInputStream(excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetname);
	Row  r = sh.getRow(rownum);
	Cell c = r.getCell(colmn);
	c.setCellType(Cell.CELL_TYPE_STRING);
	String data = c.getStringCellValue();
	return data;
	}
}
