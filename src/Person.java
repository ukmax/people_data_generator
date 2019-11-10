public class Person {
    String surname;
    String name;
    String middleName;
    HumanInfo.Gender gender;


    public Person() {
        this.gender = HumanInfo.getRandomGender();
        if (this.gender == HumanInfo.Gender.MALE) {
            this.surname = HumanInfo.getRandomMaleSurname();
            this.name = HumanInfo.getRandomMaleName();
            this.middleName = HumanInfo.getRandomMaleMiddleName();
        }
        if (this.gender == HumanInfo.Gender.FEMALE) {
            this.surname = HumanInfo.getRandomFemaleSurname();
            this.name = HumanInfo.getRandomFemaleName();
            this.middleName = HumanInfo.getRandomFemaleMiddleName();
        }

    }

}


