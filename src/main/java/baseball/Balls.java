package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    private List<Ball> balls;
    public Balls(List<Integer> computerBalls) {
        balls = mapBall(computerBalls);
    }

    public List<Ball> mapBall(List<Integer> ComputerBalls) {
        balls = new ArrayList<>();
        for (int i = 0; i< ComputerBalls.size(); i++) {
            balls.add(new Ball(i+1, ComputerBalls.get(i)));
        }
        return balls;
    }

    public Referee play(Ball playerBall) {
        for (int i = 0; i<balls.size(); i++) {
            Referee result = playerBall.play(balls.get(i));
            if (!result.isNothing()) {
                return result;
            }
        } return Referee.Nothing;
    }

    public Result makeResult(List<Integer> playerBalls) {
        Result results = new Result();
        for (int i = 0; i < playerBalls.size(); i++) {
            Referee result = play(new Ball(i+1, playerBalls.get(i)));
            results.report(result);
        }
        return results;
    }
}
