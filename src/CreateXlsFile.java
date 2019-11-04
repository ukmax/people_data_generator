import java.io.*;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;

public class CreateXlsFile {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<String> male_surnames = PeopleData.get_male_surnames();
        ArrayList<String> male_names = PeopleData.get_male_names();
        ArrayList<String> male_middle_names = PeopleData.get_male_middle_names();


        String filename = "./out/RandomPeopleData.xls";
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("First");

        HSSFRow header = sheet.createRow(0);
        header.createCell(0).setCellValue("№");
        header.createCell(1).setCellValue("Фамилия");
        header.createCell(2).setCellValue("Имя");
        header.createCell(3).setCellValue("Отчество");


        for (int i = 1; i <= n; i++) {
            HSSFRow row = sheet.createRow(i);
            row.createCell(0).setCellValue(i);
            row.createCell(1).setCellValue(PeopleData.get_random_list_value(male_surnames));
            row.createCell(2).setCellValue(PeopleData.get_random_list_value(male_names));
            row.createCell(3).setCellValue(PeopleData.get_random_list_value(male_middle_names));
        }


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
