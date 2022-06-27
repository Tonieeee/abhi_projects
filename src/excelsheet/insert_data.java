package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class insert_data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
	String path = "G:\\Abhi Lecture\\fetch.xlsx";
	//G:\\Abhi Lecture\\fetch.xlsx
	FileInputStream file= new FileInputStream(path);
	
	XSSFWorkbook excel =new  XSSFWorkbook(file);
	
	XSSFSheet sheet = excel.getSheet("check");
	
	XSSFCell cl = sheet.createRow(1).createCell(1);
	
	cl.setCellType(CellType.STRING);
	cl.setCellValue("this is the end");
	
	FileOutputStream exl= new FileOutputStream("G:\\Abhi Lecture\\fetch.xlsx");
	excel.write(exl);
	
	System.out.println("done");
	
	
	
	

}
}