import java.io.*;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;

public class XlsFile {
    public static int numberOfStrings;

    public static void main(String[] args) {
        inputStringNumber();
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("First sheet");
        createHeader(sheet);
        createDataRow(sheet);
        autoSizeColumns(sheet);
        createXlsFile(workbook);
    }

    public static void inputStringNumber(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите количество строк для генерации (от 1 до 30): ");
            while (!sc.hasNextInt()) {
                System.out.println("Введено не число.");
                sc.next();
            }
            numberOfStrings = sc.nextInt();
        } while (numberOfStrings <= 0 || numberOfStrings > 30);
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
        for (int i = 1; i <= numberOfStrings; i++) {
            HSSFRow row = sheet.createRow(i);
            Person person = new Person();
            HumanDates dates = new HumanDates();
            row.createCell(0).setCellValue(person.surname);
            row.createCell(1).setCellValue(person.name);
            row.createCell(2).setCellValue(person.middleName);
            row.createCell(3).setCellValue(dates.age);
            row.createCell(4).setCellValue(person.gender.getDescription());
            row.createCell(5).setCellValue(dates.getBirthday());
            row.createCell(6).setCellValue(AddressInfo.getRandomCity());
            row.createCell(7).setCellValue(AddressInfo.getRandomIndex());
            row.createCell(8).setCellValue(AddressInfo.getRandomCountry());
            row.createCell(9).setCellValue(AddressInfo.getRandomRegion());
            row.createCell(10).setCellValue(AddressInfo.getRandomCity());
            row.createCell(11).setCellValue(AddressInfo.getRandomStreet());
            row.createCell(12).setCellValue(AddressInfo.getRandomHouse());
            row.createCell(13).setCellValue(AddressInfo.getRandomFlat());
        }
    }

    private static void autoSizeColumns(HSSFSheet sheet) {
        int columnNumber = sheet.getRow(0).getLastCellNum();
        for (int i = 0; i <= columnNumber; i++){
            sheet.autoSizeColumn(i);
        }
    }

    public static void createXlsFile(HSSFWorkbook workbook) {
        try {
            String filename = "humans.xls";
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
