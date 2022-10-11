package baseball;

public class Ball {
    private int value;
    private int place;

    public Ball() {
        this(1,1);
    }
    public Ball(int place, int value) {
        this.place = place;
        this.value = value;

    }
    public Referee play(Ball ball) {
        if (value == ball.value && place == ball.place)
            return Referee.Strike;
        if (value == ball.value)
            return Referee.Ball;
        return Referee.Nothing;
    }
}
