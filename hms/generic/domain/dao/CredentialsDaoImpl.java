package com.hms.generic.domain.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.hms.generic.domain.authentication.User;

public class CredentialsDaoImpl implements CredentialsDao {
	
	public User getLoginInfo() {
		ArrayList<String> cellValues = getCredentials();
		User user = new User();
		user.setUsername(cellValues.get(0));
		user.setPassword(cellValues.get(1));
		return user;
	}	
	
	private ArrayList<String> getCredentials() {
		ArrayList<String> cellValues = new ArrayList<>();
		String fileName = "C:\\Users\\EI11654\\Training\\Selenium_Automation\\ExcelFiles\\PIER_Credentials.xlsx";
		try {
	        FileInputStream f = new FileInputStream(fileName);
	        XSSFWorkbook workbook = new XSSFWorkbook(f);
	        Sheet sheet = (Sheet) workbook.getSheet("LoginDataSet");
	        fetchCellValues(cellValues, sheet);
	        workbook.close();	        
        } catch (IOException e) {
            e.printStackTrace();
        }	
		return cellValues;
	}
	
	private void fetchCellValues(List<String> cellValues, Sheet sheet) {
		for (int rowNum = 1; rowNum < 2; rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				for (int colNum = 0; colNum < 2; colNum++) {
					Cell cell = row.getCell(colNum);
					if (cell != null) {
						cellValues.add(cell.toString());
					}
				}
			}
		}
	}
}