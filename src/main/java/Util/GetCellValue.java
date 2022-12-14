package Util;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GetCellValue {
    public static String getStringCellValueExcel(String sheetName, int rowNumber, int cellNumber) {
        File excelFile = new File("src/main/resources/pruebas.xlsx");
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(excelFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Workbook workbook = null;
        try {
            workbook = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Sheet sheet = workbook.getSheet(sheetName);
        Row row = sheet.getRow(rowNumber);
        Cell cell = row.getCell(cellNumber);

        if(cell.getCellTypeEnum().name().equals(CellType.NUMERIC.name())){
            return String.format("%.0f", cell.getNumericCellValue());
        } else {
            return cell.getStringCellValue();
        }
    }

}
