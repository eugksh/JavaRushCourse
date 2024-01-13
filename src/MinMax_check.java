import java.util.Scanner;
public class MinMax_check {
    Scanner console = new Scanner(System.in);
    int max; //не задавать значения - если задавать 0 или MAX MIN Value, работает неккоректно
    int min;

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
        } System.out.println(max + " " + min);
    }
}

