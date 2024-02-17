import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static void getPrediction() {
        Random prediction = new Random();
        int x = prediction.nextInt(8);
        switch (x) {
            case 0:
                System.out.println(CERTAIN);
                break;
            case 1:
                System.out.println(DEFINITELY);
                break;
            case 2:
                System.out.println(MOST_LIKELY);
                break;
            case 3:
                System.out.println(OUTLOOK_GOOD);
                break;
            case 4:
                System.out.println(ASK_AGAIN_LATER);
                break;
            case 5:
                System.out.println(TRY_AGAIN);
                break;
            case 6:
                System.out.println(NO);
                break;
            case 7:
                System.out.println(VERY_DOUBTFUL);
                break;
        }
    }
    public void Predict() {
        System.out.println("Заработаю ли я себе на BMW?");
        getPrediction();
    }
}
