
import java.util.Random;


public class Person {
    String surname;
    String name;
    String middleName;
    Gender gender;

    enum Gender {MALE, FEMALE}

    public Person() {
        this.gender = Gender.values()[new Random().nextInt(Gender.values().length)];
        if (this.gender == Gender.MALE) {
            this.surname = HumanInfo.getRandomMaleSurname();
            this.name = HumanInfo.getRandomMaleName();
            this.middleName = HumanInfo.getRandomMaleMiddleName();
        }
        if (this.gender == Gender.FEMALE) {
            this.surname = HumanInfo.getRandomFemaleSurname();
            this.name = HumanInfo.getRandomFemaleName();
            this.middleName = HumanInfo.getRandomFemaleMiddleName();
        }

    }

//    public static void main(String[] args) {
//        Person person = new Person();
//        System.out.println(person.gender);
//        System.out.println(person.surname);
//        System.out.println(person.name);
//        System.out.println(person.middleName);
//
//    }
}


