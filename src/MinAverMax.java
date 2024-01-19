import java.util.Scanner;
public class MinAverMax {
    private int a;
    private int b;
    private int c;
    private int average;

    Scanner input = new Scanner(System.in);

    public void find_average() {
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a > b && a < c || a < b && a > c)
            average = a;
        if (b > a && b < c || b < a && a > c)
            average = b;
        if (c > a && c < b || c < b && c > a)
            average = c;
        System.out.println(average);
    }
}
