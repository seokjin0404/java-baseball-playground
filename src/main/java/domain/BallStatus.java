package domain;

public enum BallStatus {
    Ball, Strike, Nothing;

    public boolean isNothing() {
        return this == Nothing;
    }

    public boolean isStrike() {
        return this == Strike;
    }

    public boolean isBall() {
        return this == Ball;
    }
}
