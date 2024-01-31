import java.util.Scanner;

public class Task_0505 {
    public void task_0505() {
        Scanner input = new Scanner(System.in);

        // Считываем целое число N
        System.out.println("Введите целое число n:");
        int n = input.nextInt();

        // Создаем массив для хранения чисел
        int[] numbers = new int[n];

        // Считываем n чисел и сохраняем в массив
        System.out.println("Введите " + n + " целых чисел:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        // Выводим числа в зависимости от четности n
        if (n % 2 != 0) {
            // Если n нечетное, выводим в том же порядке
            for (int num : numbers) {
                System.out.println(num);
            }
        } else {
            // Если n четное, выводим в обратном порядке
            for (int i = n - 1; i >= 0; i--) {
                System.out.println(numbers[i]);
            }
        }
        input.close();
    }
}
