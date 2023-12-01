import java.util.Scanner;
public class Triangle {
    Scanner triangle_side_input = new Scanner(System.in);
    private byte a = triangle_side_input.nextByte();
    private byte b = triangle_side_input.nextByte();
    private byte c = triangle_side_input.nextByte();
    public void check_triangle() {
        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            System.out.println("Triangle exists");
        } else System.out.println("Triangle doesn't exist");
    }
}
