public class Triangle_for {
    int rows = 5;  // Количество уровней треугольника

    public void triangle_for() {

        // Внешний цикл для перебора строк (уровней)
        for (int i = 0; i < rows; i++) {

            // Внутренний цикл для отступов перед звездочками
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Внутренний цикл для печати звездочек
            for (int k = 0; k < 2 * (rows - i) - 1; k++) {
                System.out.print("*");
            }

            // Переход на новую строку после каждого уровня треугольника
            System.out.println();
        }
    }
}
