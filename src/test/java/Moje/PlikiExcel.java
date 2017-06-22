package Moje;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class PlikiExcel {

	public static void main(String[] args) throws BiffException, IOException {
		FileInputStream fi = new FileInputStream ("D:\\Nowy Arkusz programu Microsoft Excel.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet ws = wb.getSheet(0);
		String a[][] = new String [ws.getRows()][ws.getColumns()];
		System.out.println(ws.getRows());
		System.out.println(ws.getColumns());

	}

}
