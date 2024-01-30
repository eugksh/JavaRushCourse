import java.util.Scanner;
public class MinMaxCheck {
    Scanner console = new Scanner(System.in);
    private int max; //не задавать значения - если задавать 0 или MAX MIN Value, работает неккоректно
    private int min;

    public void mm_check() {
        while (console.hasNextInt()) {
            int x = console.nextInt();
            String command = console.nextLine();
            if (x > max)
                max = x;
            else min = x;
            if (command.equals("stop")) {
                break;
            }
        }
        System.out.println(max + " " + min);
    }
}
