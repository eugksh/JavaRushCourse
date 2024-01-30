public class ArrayTrain {
    public void test_array() {
        int[] array;
        int a = 50;
        if (a < 10) array = new int[10];
        else array = new int[20];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println(array.length);
    }
}
