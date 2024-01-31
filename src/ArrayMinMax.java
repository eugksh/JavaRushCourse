import java.util.Scanner;

public class ArrayMinMax {
    public void arrayminmax() {
        System.out.println("Введите 5 чисел");
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = input.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < 5; i++) {
            if (array[i] < min)
                min = array[i];
        }
        int max = array[0];
        for (int k = 4; k > 0; k-- ) {
            if (array[k] > max)
                max = array[k];
        }
        System.out.println(min + " " + max);
    }
}
