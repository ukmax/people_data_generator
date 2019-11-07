
import java.util.ArrayList;
import java.util.Random;


public class Person {
    String surname;
    String name;
    String middle_name;
    Gender gender;

    enum Gender {MALE, FEMALE}

    public Person() {
        this.gender = Gender.values()[new Random().nextInt(Gender.values().length)];
        if (this.gender == Gender.FEMALE){
            this.surname ="Петрова";
            this.name = "Мария";
            this.middle_name = "Семеновна";
        }
        if (this.gender == Gender.MALE){
            this.surname ="Воронцов";
            this.name = "Николай";
            this.middle_name = "Петрович";
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.gender);
        System.out.println(person.surname);
        System.out.println(person.name);
        System.out.println(person.middle_name);

    }
}


