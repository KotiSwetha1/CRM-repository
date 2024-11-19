package Sample;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class FetchMultipleDataFromExcelSheet {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis=new FileInputStream("D:\\Admin.xlsx");
//		Workbook wb=WorkbookFactory.create(fis);
//		Sheet sh=wb.getSheet("Leads");
//		System.out.println(sh.getLastRowNum());
//		DataFormatter df=new DataFormatter();
//		for(int i=0;i<=sh.getLastRowNum();i++)
//		{
//			Row r=sh.getRow(i);
//			for(int j=0;j<r.getLastCellNum();j++)
//			{
//				Cell c=r.getCell(j);
//				String value=df.formatCellValue(c);
//				System.out.println(value);
//			}
//		}
			ExcelUtility e=new ExcelUtility();
			String value1=e.getMultipleDataFromExcel("Admin", 3, 2);
			System.out.println(value1);

	}

}
