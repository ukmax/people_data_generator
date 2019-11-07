import java.io.*;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;

public class CreateXlsFile {
    public static void main(String[] args) {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("First sheet");
        createHeader(sheet);
        createDataRow(sheet);
        createXlsFile(workbook);
    }

    public static void createHeader(HSSFSheet sheet) {
        HSSFRow header = sheet.createRow(0);
        header.createCell(0).setCellValue("Фамилия");
        header.createCell(1).setCellValue("Имя");
        header.createCell(2).setCellValue("Отчество");
        header.createCell(3).setCellValue("Возраст");
        header.createCell(4).setCellValue("Пол");
        header.createCell(5).setCellValue("Дата рождения");
        header.createCell(6).setCellValue("Место рождения");
        header.createCell(7).setCellValue("Индекс");
        header.createCell(8).setCellValue("Страна");
        header.createCell(9).setCellValue("Область");
        header.createCell(10).setCellValue("Город");
        header.createCell(11).setCellValue("Улица");
        header.createCell(12).setCellValue("Дом");
        header.createCell(13).setCellValue("Квартира");

    }

    public static void createDataRow(HSSFSheet sheet) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            ArrayList<String> male_surnames = HumanData.get_male_surnames();
            ArrayList<String> male_names = HumanData.get_male_names();
            ArrayList<String> male_middle_names = HumanData.get_male_middle_names();

            HSSFRow row = sheet.createRow(i);
            row.createCell(0).setCellValue(HumanData.get_random_list_value(male_surnames));
            row.createCell(1).setCellValue(HumanData.get_random_list_value(male_names));
            row.createCell(2).setCellValue(HumanData.get_random_list_value(male_middle_names));
        }
    }

    public static void createXlsFile(HSSFWorkbook workbook) {
        try {
            String filename = "humans_data1.xls";
            String filepath = "./out/";
            File xlsFile = new File(filepath + filename);
            FileOutputStream fileOut = new FileOutputStream(xlsFile);
            workbook.write(fileOut);
            fileOut.close();
            workbook.close();
            System.out.println("Файл создан. Путь: " + xlsFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
