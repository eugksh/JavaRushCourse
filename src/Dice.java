public class Dice {
    public static int generateNumber() {
        return (int) (Math.random() * 6) + 1;
    }

    public void Number() {
        System.out.println(generateNumber());
    }
}
