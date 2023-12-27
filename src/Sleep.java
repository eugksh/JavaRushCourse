import java.time.LocalTime;
public class Sleep {
    int hour = LocalTime.now().getHour();
    int minute = LocalTime.now().getMinute();
    public void time_to_sleep(){
        System.out.println("Время " + hour + ":" + minute);
        if (hour >= 22 || hour >=0 && hour <= 4 ) {
            System.out.println("Good night");
        } else System.out.println("Time for fun");
    }
}
