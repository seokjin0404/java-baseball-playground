package domain;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private List<Ball> balls;
    public Balls(List<Integer> balls) {
        if (this.isNotRightSize(balls))
            throw new IllegalArgumentException();
        this.balls = mapBalls(balls);
    }

    private boolean isNotRightSize(List<Integer> balls) {
        return balls.size() != 3;
    }

    private List<Ball> mapBalls(List<Integer> balls) {
        List<Ball> mappedBalls = new ArrayList<Ball>();
        for (int i = 0; i < 3; i++) {
            mappedBalls.add(new Ball(new Position(i+1), new BallNumber(balls.get(i))));
        }
        return mappedBalls;
    }

    public BallStatus play(Ball ball) {
        for (int i = 0; i<3; i++) {
            Ball computer = balls.get(i);
            if (isNotNothing(computer, ball))
                return computer.play(ball);
        }
        return BallStatus.Nothing;
    }
    private boolean isNotNothing(Ball computer, Ball player) {
        return !computer.play(player).isNothing();
    }
}
