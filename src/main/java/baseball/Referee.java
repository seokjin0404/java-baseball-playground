package baseball;

public enum Referee {
    Nothing, Strike, Ball;

    public boolean isNothing() {
        return this == Nothing;
    }
}
