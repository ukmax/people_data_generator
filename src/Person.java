
import java.util.Random;


public class Person {
    String surname;
    String name;
    String middleName;
    Gender gender;

    enum Gender {MALE, FEMALE}

    public Person() {
        this.gender = Gender.values()[new Random().nextInt(Gender.values().length)];
        if (this.gender == Gender.FEMALE) {
            this.surname = "Петрова";
            this.name = "Мария";
            this.middleName = "Семеновна";
        }
        if (this.gender == Gender.MALE) {
            this.surname = "Воронцов";
            this.name = "Николай";
            this.middleName = "Петрович";
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


