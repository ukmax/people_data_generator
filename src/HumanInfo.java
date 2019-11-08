import java.util.ArrayList;
import java.util.Random;

public class HumanInfo {

    public static String getRandomMaleSurname() {
        return getRandomValue(ParsedData.getMaleSurnames());
    }

    public static String getRandomMaleName() {
        return getRandomValue(ParsedData.getMaleNames());
    }

    public static String getRandomMaleMiddleName() {
        return getRandomValue(ParsedData.getMaleMiddleNames());
    }

    public static String getRandomFemaleSurname() {
        return getRandomValue(ParsedData.getFemaleSurnames());
    }

    public static String getRandomFemaleName() {
        return getRandomValue(ParsedData.getFemaleNames());
    }

    public static String getRandomFemaleMiddleName() {
        return getRandomValue(ParsedData.getFemaleMiddleNames());
    }

    public static String getRandomCity() {
        return getRandomValue(ParsedData.getCities());
    }

    public static String getRandomRegion() {
        return getRandomValue(ParsedData.getRegions());
    }

    public static String getRandomStreet() {
        return getRandomValue(ParsedData.getStreets());
    }


    private static String getRandomValue(ArrayList<String> list) {
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(list.size());
        return list.get(index);
    }

    public static int getRandomHouse() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(100);
    }

    public static int getRandomFlat() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1000);
    }

    public static String getRandomIndex() {
        Random randomGenerator = new Random();
        String index = "";
        for (int i = 1; i < 7; i++) {
            int digit = randomGenerator.nextInt(10);
            index = index + digit;
        }
        return index;

    }


}