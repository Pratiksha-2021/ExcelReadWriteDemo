package com.exceloperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeexcelData {
	public static void main(String[] args) throws Exception {

		XSSFWorkbook wb = new XSSFWorkbook();

		XSSFSheet sheetdata = wb.createSheet("sheetTestData2");
		Row row_0 = sheetdata.createRow(0);

		Cell cell_A = row_0.createCell(0);
		Cell cell_B = row_0.createCell(1);
		cell_A.setCellValue("pratiksha");
		cell_A.setCellValue("gunjal");

		File file = new File(System.getProperty("user.dir")
				+ "\\src\\main\\resourse\\testData\\excelFiles\\Automation_external_testdata2.xlsx");
		FileOutputStream fout = new FileOutputStream(file);

		wb.write(fout);

		System.out.println("testdata added successfully");

	}

}
