public class Task_0407 {
    private int i = 0;
    private int x = 0;
    public void three () {
        while (i < 101) {
            i++;
            if ( (i % 3) != 0)
                continue; // пропуск чисел, не кратных трем
            System.out.println(i);
        }
    }

    public void two (){
        while (x < 50) {
            x++;
            if ((x%2) == 0)
                break; // останавливается на 2
            System.out.println(x);
        }
    }
}
