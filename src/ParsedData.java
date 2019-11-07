import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ParsedData {
    public static ArrayList<String> getMaleSurnames() {
        return getListFromFile("./data/male_surnames");
    }

    public static ArrayList<String> getMaleNames() {
        return getListFromFile("./data/male_names");
    }

    public static ArrayList<String> getMaleMiddleNames() {
        return getListFromFile("./data/male_middle_names");
    }

    public static ArrayList<String> getFemaleSurnames() {
        return getListFromFile("./data/female_surnames");
    }

    public static ArrayList<String> getFemaleNames() {
        return getListFromFile("./data/female_names");
    }

    public static ArrayList<String> getFemaleMiddleNames() {
        return getListFromFile("./data/female_middle_names");
    }

    public static ArrayList<String> getCities() {
        return getListFromFile("./data/cities");
    }

    public static ArrayList<String> getRegions() {
        return getListFromFile("./data/regions");
    }

    public static ArrayList<String> getStreets() {
        return getListFromFile("./data/streets");
    }

    public static ArrayList<String> getListFromFile(String path) {
        ArrayList<String> list = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line != null) {
                list.add(line);
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }


}