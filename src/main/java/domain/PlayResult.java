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

    public boolean hasNothing() {
        return (strike==0 && ball==0);
    }

    public boolean hasBall() {
        return ball!=0;
    }

    public boolean hasStrike() {
        return strike!=0;
    }

    public boolean GameEnd() {
        return strike==3;
    }
}
