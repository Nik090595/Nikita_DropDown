package com.Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet {

	public static String GetData(int row, int cell, String FileName) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Nikita\\Documents\\Selenium_Practice\\Zerodha.xlsx");
		String Value = WorkbookFactory.create(file).getSheet(FileName).getRow(row).getCell(cell).getStringCellValue();
		return Value;
	}
}
