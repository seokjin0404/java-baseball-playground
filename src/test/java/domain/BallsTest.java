package domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class BallsTest {
    @Test
    public void play_3strikes() {
        Balls computerBalls = new Balls(Arrays.asList(1,2,3));
        PlayResult result = computerBalls.play(Arrays.asList(1,2,3));
        assertThat(result.getStrike()).isEqualTo(3);
        assertThat(result.getBall()).isEqualTo(0);
    }
    @Test
    public void play_2balls() {
        Balls computerBalls = new Balls(Arrays.asList(1,2,3));
        PlayResult result = computerBalls.play(Arrays.asList(2,3,4));
        assertThat(result.getStrike()).isEqualTo(0);
        assertThat(result.getBall()).isEqualTo(2);
    }
    @Test
    public void play_nothing() {
        Balls computerBalls = new Balls(Arrays.asList(1,2,3));
        PlayResult result = computerBalls.play(Arrays.asList(4,5,6));
        assertThat(result.getStrike()).isEqualTo(0);
        assertThat(result.getBall()).isEqualTo(0);
    }

    @Test
    public void strike() {
        Balls computerBalls = new Balls(Arrays.asList(1,2,3));
        BallStatus status = computerBalls.play(new Ball(new Position(1), new BallNumber(1)));
        assertThat(status).isEqualTo(BallStatus.Strike);
    }
    @Test
    public void ball() {
        Balls computerBalls = new Balls(Arrays.asList(1,2,3));
        BallStatus status = computerBalls.play(new Ball(new Position(1), new BallNumber(2)));
        assertThat(status).isEqualTo(BallStatus.Ball);
    }

    @Test
    public void nothing() {
        Balls computerBalls = new Balls(Arrays.asList(1,2,3));
        BallStatus status = computerBalls.play(new Ball(new Position(1), new BallNumber(4)));
        assertThat(status).isEqualTo(BallStatus.Nothing);
    }
}
