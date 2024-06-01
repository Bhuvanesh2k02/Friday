package ExcelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileRead
{
	
	String [][] rowcollum;
	String excelfile = System.getProperty("user.dir")+"\\ExcelSheet\\Automation.xlsx";
	public void ExcelSheetReadFile() throws IOException
	{
		File file=new File(excelfile);
		FileInputStream fs=new FileInputStream(file);
		
		XSSFWorkbook wbk = new XSSFWorkbook(fs);//we need to add Apachi Poi dependency
		
		XSSFSheet spreadSheet=wbk.getSheet("Sheet1");
		int Totalrows =spreadSheet.getPhysicalNumberOfRows();
		XSSFRow Trow=spreadSheet.getRow(1);
		int TotalCollum=Trow.getLastCellNum();
		rowcollum=new String [Totalrows][TotalCollum];
		for(int i=0;i<Totalrows;i++)
		{
			XSSFRow totalrow=spreadSheet.getRow(i);
			int TotalCollum1=totalrow.getLastCellNum();
			for(int j=0;j<TotalCollum1;j++)
			{
				XSSFCell totalcollum=totalrow.getCell(j);
				//rowcollum[i][j]=(String) ChangeDataFormate(totalcollum);
				System.out.print(ChangeDataFormate(totalcollum));
				System.out.print("  ");
			}
			System.out.println(" ");
		}
		
		fs.close();
		
	}
	
	List<Object> list= new ArrayList<>();
	
	
	public static Object ChangeDataFormate(Cell cellValue)
	{
		if(cellValue.getCellType()==CellType.STRING)
		{
			return cellValue.getStringCellValue();
		}
		else if(cellValue.getCellType()==CellType.NUMERIC)
		{
			DataFormatter data =  new DataFormatter();
			return data.formatCellValue(cellValue);
			//return cellValue.getNumericCellValue();
		}
		return null;
	}
public static void main(String[] args) throws IOException {
	ExcelFileRead r=new ExcelFileRead();
	r.ExcelSheetReadFile();
}



}



