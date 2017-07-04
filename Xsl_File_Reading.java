/**
 *XSl _File_Reading  
 */
package File_reading;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author varaprasad
 *
 */
public class Xsl_File_Reading {

	private static XSSFWorkbook wb;

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		
		// source of the file reading give a location of the XSL FILE PATH
		File src = new File("C:\\Users\\varaprasad\\Desktop\\sample.xlsx");
		// Read the XSL file from  source path
		FileInputStream f1= new FileInputStream(src);
		//Read the workbook from XSL file given by source
		wb = new XSSFWorkbook(f1);
		//Read the sheet from XSL given by WORKBOOK
		XSSFSheet sheet1 = wb.getSheetAt(0);
		/*//PicK the values from given sheet numbers list by help of rows and columns
		String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		//print the data from sheet on file 
		System.out.println("Data from excel file :"+data0);
		
		String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from excel file :"+data1);*/
		
		//total rows detailed data
		int rowcount = sheet1.getLastRowNum();
		System.out.println("Total rows is :"+rowcount);
		for(int i=0;i<rowcount;i++){
			
			String data0= sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Read the row" +i+ " from Excel:"+data0);
			
		}
		wb.close();
	
	}

}
