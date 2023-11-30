import java.sql.SQLOutput;
import java.util.Scanner;
public class Task_0303 {
    Scanner age_input = new Scanner(System.in);
    int age = age_input.nextInt();
        public void check_age() {
            if (age < 18) {
                if (age >= 6)
                    System.out.println("нужно ходить в школу");
                else
                    System.out.println("нужно ходить в садик");
            } else {
                System.out.println("пора в институт");
            }
        }
    }
