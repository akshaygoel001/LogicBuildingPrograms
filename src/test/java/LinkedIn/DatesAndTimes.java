package LinkedIn;



import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatesAndTimes {

    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();
        LocalDate ld1 = LocalDate.of(2025,3,22);

        System.out.println(ld);
        System.out.println(ld1);

        LocalTime lt = LocalTime.now();
        LocalTime lt1 = LocalTime.of(10,11);

        System.out.println(lt);
        System.out.println(lt1);

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt);

        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);





    }
}
