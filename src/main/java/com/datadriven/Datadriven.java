package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.XLSBUnsupportedException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {

	public static void particulardata() throws IOException {
		System.out.println("particular data");
		File f = new File("C:\\Users\\SIRISA B S\\Desktop\\Java notes\\Project Tasks\\datadriven.xlsx");
		FileInputStream fa = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fa);

		Sheet sheet = w.getSheet("workbook");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		if (cellType.equals(cellType.STRING)) {
			String stringCellValue1 = cell.getStringCellValue();
			System.out.println(stringCellValue1);
		} else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int i = (int) numericCellValue;
			System.out.println(i);

		}
		System.out.println();

	}

	public static void alldata() throws Throwable {
		System.out.println("All data");
		File f = new File("C:\\Users\\SIRISA B S\\Desktop\\Java notes\\Project Tasks\\datadriven.xlsx");
		FileInputStream fa = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fa);

		Sheet sheet = w.getSheet("workbook");
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheet.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < physicalNumberOfCells; j++) {

				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();

				if (cellType.equals(cellType.STRING)) {
					String stringCellValue2 = cell.getStringCellValue();
					System.out.println(stringCellValue2);
				} else if (cellType.equals(cellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int in = (int) numericCellValue;
					System.out.println(in);
  
				}
			}

			System.out.println();
		}

	}
	public static void zeroth_column() throws IOException {
		System.out.println("Particular column");
		File f = new File("C:\\Users\\SIRISA B S\\Desktop\\Java notes\\Project Tasks\\datadriven.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheetAt = w.getSheetAt(0);
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			Cell cell = row.getCell(0);
			CellType cellType = cell.getCellType();
			if (cellType.equals(cellType.STRING)) {
				String stringCellValue3 = cell.getStringCellValue();
				System.out.println(stringCellValue3);
				
			}
			else if (cellType.equals(cellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int a = (int) numericCellValue;
				System.out.println(a);
				
			}
			
		}
		System.out.println();
		
		

	}
	public static void single_row() throws IOException {
		System.out.println("Single_Row");
		File f = new File("C:\\Users\\SIRISA B S\\Desktop\\Java notes\\Project Tasks\\datadriven.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(0);
		
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < physicalNumberOfCells; i++) {
			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();
			if (cellType.equals(cellType.STRING)) {
				String stringCellValue4 = cell.getStringCellValue();
				System.out.println(stringCellValue4);
				
			}
			else if (cellType.equals(cellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int a1 = (int) numericCellValue;
				System.out.println(a1);
				
			}
			
		}
		System.out.println();
			
			
		}
		
		
		

	

	public static void main(String[] args) throws Throwable {
		particulardata();
		alldata();
		zeroth_column();
		single_row();
	}

}
