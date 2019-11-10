import java.util.ArrayList;
import java.util.Random;

public class AddressInfo {
    private static String getRandomValue(ArrayList<String> list) {
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(list.size());
        return list.get(index);
    }

    public static String getRandomCity() {
        return getRandomValue(ParsedData.getCities());
    }

    public static String getRandomCountry() {
        return getRandomValue(ParsedData.getСountry());
    }

    public static String getRandomRegion() {
        return getRandomValue(ParsedData.getRegions());
    }

    public static String getRandomStreet() {
        return getRandomValue(ParsedData.getStreets());
    }

    public static int getRandomHouse() {
        Random randomGenerator = new Random();
        return 1 + randomGenerator.nextInt(99);
    }

    public static int getRandomFlat() {
        Random randomGenerator = new Random();
        return 1 + randomGenerator.nextInt(999);
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
