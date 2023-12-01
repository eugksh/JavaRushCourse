import java.time.LocalTime;
public class Sleep {
    LocalTime time = LocalTime.now();
    int hour = LocalTime.now().getHour();
    public void time_to_sleep(){
        System.out.println("Время " + time);
        if (hour >= 23 || hour >=0 && hour <= 4 ) {
            System.out.println("Good night");
        } else System.out.println("Time for fun");
    }
}

