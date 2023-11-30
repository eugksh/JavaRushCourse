import java.util.Scanner;
public class Task_0301 {
    Scanner weather_input = new Scanner(System.in);
    int weather = weather_input.nextInt();
    String cold = "на улице холодно";
    String warm = "на улице тепло";
    public void task_0301() {
        if (weather <= 0) {
            System.out.println(cold);
        } else {
            System.out.println(warm);
        }
        weather_input.close();
    }
}