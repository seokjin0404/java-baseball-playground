package domain;

public class PlayResult {
    private int strike;
    private int ball;

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public void report(BallStatus status) {
        if (status.isStrike())
            strike += 1;
        if (status.isBall())
            ball += 1;
    }
}
