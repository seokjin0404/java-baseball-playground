package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ballTest {
    private Ball computer;
    @BeforeEach
    public void setUp() {
        computer = new Ball(new Position(1), new BallNumber(2));
    }
    @Test
    public void StrikeTest() {
        Ball player = new Ball(new Position(1), new BallNumber(2));
        assertThat(computer.play(player)).isEqualTo(BallStatus.Strike);
    }

    @Test
    public void BallTest() {
        Ball player = new Ball(new Position(2), new BallNumber(2));
        assertThat(computer.play(player)).isEqualTo(BallStatus.Ball);
    }
    @Test
    public void nothingTest() {
        Ball player = new Ball(new Position(1), new BallNumber(3));
        assertThat(computer.play(player)).isEqualTo(BallStatus.Nothing);
    }
}
