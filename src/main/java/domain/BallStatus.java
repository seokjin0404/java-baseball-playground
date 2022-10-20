package domain;

public enum BallStatus {
    Ball, Strike, Nothing;

    public boolean isNothing() {
        return this == Nothing;
    }
}
