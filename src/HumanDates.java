import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.YEARS;

public class HumanDates {
    LocalDate birthday;
    long age;

    public HumanDates() {
        this.birthday = LocalDate.now()
                .minus(Period.ofDays((new Random().nextInt(365 * 100)))); //последние 100 лет
        this.age = YEARS.between(birthday, LocalDate.now());
    }

    public String getBirthday() {
        return birthday.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
    }
}