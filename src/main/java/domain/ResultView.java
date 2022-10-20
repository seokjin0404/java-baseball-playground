package domain;

public class ResultView {
    public static void show(PlayResult result) {
        int strike = result.getStrike();
        int ball = result.getBall();
        if (result.hasNothing())
            System.out.println("낫씽");
        if (result.hasBall())
            System.out.printf("%d볼 ", ball);
        if (result.hasStrike())
            System.out.printf("%d스트라이크\n", strike);
    }
}
