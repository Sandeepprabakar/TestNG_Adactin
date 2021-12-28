package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Write {

	public static void Datawrite() throws IOException {

		File f = new File("C:\\Users\\SIRISA B S\\Desktop\\datawrite.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		wb.createSheet("write1").createRow(0).createCell(0).setCellValue("username");

		wb.getSheet("write1").getRow(0).createCell(1).setCellValue("password");

		wb.getSheet("write1").createRow(1).createCell(0).setCellValue("yuvaraj");
		wb.getSheet("write1").getRow(1).createCell(1).setCellValue(666666);

		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("successfully wrritten");

		System.exit(0);
		
		

	}
	public static void main(String[] args) throws Throwable {
		Datawrite();
	}

}
