import java.util.Scanner;

public class Task_0505 {
    public void task_0505() {
        Scanner scanner = new Scanner(System.in);

        // Считываем целое число N
        System.out.println("Введите целое число N:");
        int N = scanner.nextInt();

        // Создаем массив для хранения чисел
        int[] numbers = new int[N];

        // Считываем N чисел и сохраняем в массив
        System.out.println("Введите " + N + " целых чисел:");
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Выводим числа в зависимости от четности N
        if (N % 2 == 1) {
            // Если N нечетное, выводим в том же порядке
            for (int num : numbers) {
                System.out.println(num);
            }
        } else {
            // Если N четное, выводим в обратном порядке
            for (int i = N - 1; i >= 0; i--) {
                System.out.println(numbers[i]);
            }
        }
        scanner.close();
    }
}
