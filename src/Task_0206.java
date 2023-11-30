import java.sql.Struct;

public class Task_0206 {
    String name = "Petja";
    String phrase = "Phrase";
    String line = "Line";
    String text = "Text";

    String num_test = "123";
    int num_test_int = Integer.parseInt(num_test);

    int num_test_int2 = 567;
    String num_test2 = "" + num_test_int2;
    String num_test3 = String.valueOf(num_test_int2);
    String num_test4 = String.valueOf(num_test_int2);
    String num_test5 = Integer.toString(num_test_int2);


    public void task_0206() {
        System.out.println(name + " " + phrase + " " + line + " " + text);
        System.out.println(num_test_int + " " + num_test_int2);
        System.out.println(num_test2 + " " + num_test3 + " " + num_test4 + " " + num_test5);
    }
}
