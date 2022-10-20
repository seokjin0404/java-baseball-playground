package domain;

public class Ball {

    private Position position;
    private BallNumber ballNumber;
    public Ball(Position position, BallNumber ballNumber) {
        this.position = new Position(position);
        this.ballNumber = new BallNumber(ballNumber);
    }
    public BallStatus play(Ball ball) {
        if (this.equals(ball))
            return BallStatus.Strike;
        if (sameNumber(ball))
            return BallStatus.Ball;
        return BallStatus.Nothing;
    }
    private boolean sameNumber(Ball ball) {
        return ballNumber.sameNumber(ball.ballNumber);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass())
            return false;
        Ball otherBall = (Ball) other;
        return position.equals(otherBall.position) && ballNumber.equals(otherBall.ballNumber);
    }
}
