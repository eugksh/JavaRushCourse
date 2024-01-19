import java.util.Scanner;
public class Task_0412 {
    public void task_0412 (){
        System.out.println("Введите наибольшее число, затем наименьшее и кратное");
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        int multiple = input.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i++ ) {
            if (i % multiple == 0) {
                sum = sum + i;
                System.out.println(i);
            }

        }
        System.out.println(sum);
    }
}
