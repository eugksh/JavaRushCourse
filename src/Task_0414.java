import java.util.Scanner;
public class Task_0414 {
    // Напечатать строку заданное количество раз
    public void task_0414() {
        System.out.println("Enter something and number of rows");
        Scanner input = new Scanner(System.in);
        String row = input.nextLine();
        byte rows_number = input.nextByte();
        do {
            System.out.println(row);
            rows_number--;
        } while (rows_number > 0);
    }
}
