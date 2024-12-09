package basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipleData
{
	public static void main(String[] args) throws IOException 
	{
	FileInputStream f=new FileInputStream("./Testdata/FacebookCredentials.xlsx");
	XSSFWorkbook book=new XSSFWorkbook(f);
	XSSFSheet sheet=book.getSheet("sheet1");
	int lr=sheet.getLastRowNum();
	for (int i = 0; i <= lr; i++)
	{
	XSSFRow row=sheet.getRow(i);
	XSSFCell c1=row.getCell(0);
	String c1val1=c1.getStringCellValue();
	XSSFCell c2=row.getCell(1);
	String c2val2=c2.getStringCellValue();
	System.out.println(c1val1+" "+c2val2);
	}
	book.close();
	f.close();
	}
}
