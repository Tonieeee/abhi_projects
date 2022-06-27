package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelfetch {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path = "G:\\Abhi Lecture\\fetch.xlsx";
		
		//To identify location of excel sheet
		FileInputStream file= new FileInputStream(path);
		//
		Sheet abc= WorkbookFactory.create(file).getSheet("check");
		
		double data1= abc.getRow(1).getCell(0).getNumericCellValue();
		System.out.println(data1);
		
		String data = abc.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		
		boolean data2 = abc.getRow(1).getCell(1).getBooleanCellValue();
		System.out.println(data2);
	}

}
