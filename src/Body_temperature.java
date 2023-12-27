import java.util.Scanner;
public class Body_temperature {
    Scanner temp_input = new Scanner(System.in);
    float temperature = temp_input.nextFloat();
    boolean isHigh = (temperature > 36.6);
    boolean isNormal = (temperature == 36.6);
    boolean isLow = (temperature < 36);
    public void check_temp() {
        if (isHigh) {
            System.out.println("High Temperature");
        } else if (isNormal) {
            System.out.println("Normal temperature");
        } else if (isLow) {
            System.out.println("Low temperature");
        }
    }
}
