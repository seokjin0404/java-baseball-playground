package baseball;

public class Result {

    private int strike;
    private int ball;
    public int getStrike() {
        return strike;
    }
    public int getBall() {
        return ball;
    }

    public void report(Referee result) {
        if (result == Referee.Strike)
            strike += 1;
        if (result == Referee.Ball)
            ball += 1;
    }
}
