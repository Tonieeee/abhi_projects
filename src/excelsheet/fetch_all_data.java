package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetch_all_data {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path = "C:\\Users\\Ratnakar\\Downloads\\Velocity Katraj 12Feb-B_Mock Result_16_April_Group3.xlsx";
		//G:\\Abhi Lecture\\fetch.xlsx
		FileInputStream file= new FileInputStream(path);
		
		Sheet abhi= WorkbookFactory.create(file).getSheet("Sheet1");
		
		int rowcount= abhi.getLastRowNum(); //count-1
		for(int i=0; i<=rowcount; i++)
		{
			int cellcount= abhi.getRow(i).getLastCellNum();
			for(int j=0; j<=cellcount-1;j++) 
			{
				 Cell cellinfo = abhi.getRow(i).getCell(j);
				 CellType type = cellinfo.getCellType();
				 
				 if(type==CellType.STRING)
				 {
					 System.out.print(cellinfo.getStringCellValue()+" ");
				 }
				 
				 else if(type==CellType.NUMERIC)
				 {
					 System.out.print(cellinfo.getNumericCellValue()+" ");
				 }
				 
				 else if(type==CellType.BOOLEAN)
				 {
					 System.out.print(cellinfo.getBooleanCellValue()+" ");
				 }
				
			}	
			System.out.println();
}	
}
}