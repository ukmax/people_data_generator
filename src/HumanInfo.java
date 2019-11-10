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

    public static Gender getRandomGender() {
        return Gender.values()[new Random().nextInt(Gender.values().length)];
    }

    public enum Gender {
        MALE("МУЖ"),
        FEMALE("ЖЕН");

        private String description;

        private Gender(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    private static String getRandomValue(ArrayList<String> list) {
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(list.size());
        return list.get(index);
    }
}