public class Task_0614 {
    public static final double PI = 3.14;
    public static final double RADIUS = 2.5;
    public static final double DIAMETER = 5;

    public static double sin(double a) {
        return Math.sin(Math.toRadians(a));
    }

    public static double cos(double a) {
        return Math.cos(Math.toRadians(a));
    }

    public static double tan(double a) {
        return Math.tan(Math.toRadians(a));
    }

    public void task_0614() {
        System.out.println("Плошадь круга равна: " + PI * RADIUS * RADIUS);
        System.out.println("Периметр круга равен: " + PI * DIAMETER);
        System.out.println(sin(45) + " " + cos(67) + " " + tan(89));
    }

}