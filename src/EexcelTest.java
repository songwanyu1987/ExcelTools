import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class EexcelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Workbook wb = new HSSFWorkbook();
		Sheet sht = wb.createSheet("test01");
		Row row = sht.createRow(0);
		CellStyle cs = wb.createCellStyle();
        cs.setAlignment(CellStyle.ALIGN_CENTER);
        cs.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
        cs.setBorderBottom(CellStyle.BORDER_DOTTED); 
        cs.setBorderLeft(CellStyle.BORDER_THIN); 
        cs.setBorderRight(CellStyle.BORDER_THIN);
        cs.setBorderTop(CellStyle.BORDER_THIN);
        Cell cell = row.createCell(0);
        cell.setCellStyle(cs);
        cell.setCellValue("序号");
        cell = row.createCell(1);
        cell.setCellStyle(cs);
        cell.setCellValue("用户");
        row = sht.createRow(1);
        cell = row.createCell(0);
        cell.setCellValue("1");
        cell = row.createCell(1);
        cell.setCellValue("张起灵");
        FileOutputStream fos;
		try {
			fos = new FileOutputStream("D:/测试的Excel.xls");
	        wb.write(fos);
	        if(null != fos){
	            fos.close();
	        }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
