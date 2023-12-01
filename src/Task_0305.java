import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Task_0305 {
    Scanner number_input = new Scanner(System.in);
    private int a = number_input.nextInt();
    private int b = number_input.nextInt();
    private int c = number_input.nextInt();

    public void number_print() {
        if (a == b && b == c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a == b && b != c && a != c) {
            System.out.println(a + " " + b);
        } else if (a == c && b != c && b != a) {
            System.out.println(a + " " + c);
        } else if (b == c && a != b && a != c) {
            System.out.println(b + " " + c);
        } else if (a != b && b != c && a != c) {
            System.out.println("Numbers are not equal");
        }
    }

    public void number_print_opt() {
        if (a == b) {
            if (a == c) {
                System.out.println(a + " " + b + " " + c);
            } else
                System.out.println(a + " " + b);
        } else if (b == c) {
            System.out.println(b + " " + c);
        } else if (a == c) {
            System.out.println(a + " " + c);
        }
    }
}
