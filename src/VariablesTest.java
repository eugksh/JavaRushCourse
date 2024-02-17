import java.text.DecimalFormat;

public class VariablesTest {
    byte a = Byte.MIN_VALUE;
    short b = Short.MIN_VALUE;
    int c = Integer.MIN_VALUE;
    long d = Long.MIN_VALUE;

    public void task0704() {
        double earthDiameter = 12742.0;
        double lightSpeed = 299792458.0;
        double uraniumAtomicMass = 238.0289;
        double averageBeeWeight = 0.085;
        double javaDeveloperSalary = 10000.0;

        // Создаем экземпляр DecimalFormat с форматом экспоненты
        DecimalFormat decimalFormat = new DecimalFormat("0.#########E0");

        // Применяем формат к числам
        String formattedNumber1 = decimalFormat.format(earthDiameter) + " " + decimalFormat.format(lightSpeed)
                + " " + decimalFormat.format(uraniumAtomicMass) + " " + decimalFormat.format(averageBeeWeight) + " "
                + decimalFormat.format(javaDeveloperSalary);

        // Выводим результаты
        System.out.println(formattedNumber1);
    }
}
