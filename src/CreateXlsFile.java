import  java.io.*;
import  org.apache.poi.hssf.usermodel.HSSFSheet;
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;
import  org.apache.poi.hssf.usermodel.HSSFRow;

public class CreateXlsFile {
    public static void main(String[]args) {
        String filename = "D:/MyFile.xls" ;
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("First");

        HSSFRow header = sheet.createRow(0);
        header.createCell(0).setCellValue("№");
        header.createCell(1).setCellValue("Фамилия");
        header.createCell(2).setCellValue("Имя");
        header.createCell(3).setCellValue("Отчество");

        HSSFRow row = sheet.createRow(1);
        row.createCell(0).setCellValue("1");
        row.createCell(1).setCellValue("Петров");
        row.createCell(2).setCellValue("Иван");
        row.createCell(3).setCellValue("Васильевич");
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            workbook.write(fileOut);
            fileOut.close();
            workbook.close();
            System.out.println("Файл создан!");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
