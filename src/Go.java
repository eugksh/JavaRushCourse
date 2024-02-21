import java.util.concurrent.TimeUnit;

public class Go {
    public static void Gagarin() throws InterruptedException {
        countDown();
    }
    public static void countDown() throws InterruptedException {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("Поехали");
    }
}

