public class ResultView {
    public static void showResult(Counter counter) {
        int ball = counter.getBall();
        int strike = counter.getStrike();

        if (ball != 0) {
            System.out.printf("%d볼 ", ball);
        }
        if (strike == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        } else if (strike != 0) {
            System.out.printf("%d스트라이크", strike);
        }
        if (ball == 0 && strike == 0) {
            System.out.println("낫싱");
        }
    }
}
