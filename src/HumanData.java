import java.util.ArrayList;
import java.util.Random;

public class HumanData {

    public static ArrayList<String> get_male_surnames() {
        return ParseData.getList("./data/male_surnames");
    }

    public static ArrayList<String> get_male_names() {
        return ParseData.getList("./data/male_names");
    }

    public static ArrayList<String> get_male_middle_names() {
        return ParseData.getList("./data/male_middle_names");
    }

    public static String get_random_list_value(ArrayList<String> list) {
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(list.size());
        return list.get(index);
    }


}