public class Xmas {
    int rows = 5;  // Количество уровней елочки

    public void tree() {

        // Внешний цикл для перебора строк (уровней)
        for (int i = 0; i < rows; i++) {

            // Внутренний цикл для отступов перед звездочками
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Внутренний цикл для печати звездочек
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            // Переход на новую строку после каждого уровня елочки
            System.out.println();
        }
    }
}