package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ballsTest {

    public Balls computerBalls;

    @BeforeEach
    public void setUp() {
        computerBalls = new Balls(Arrays.asList(1,2,3));
    }

    @Test
    public void nothing() {
        Referee result = computerBalls.play(new Ball(1,4));
        assertThat(result).isEqualTo(Referee.Nothing);
    }

    @Test
    public void ballTest() {
        Referee result = computerBalls.play(new Ball(1,2));
        assertThat(result).isEqualTo(Referee.Ball);
    }

    @Test
    public void strikeTest() {
        Referee result = computerBalls.play(new Ball(1,1));
        assertThat(result).isEqualTo(Referee.Strike);
    }

}
