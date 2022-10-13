package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ThreeBallsTest {
    Balls computerBalls;

    @BeforeEach
    public void setUp() {
        computerBalls = new Balls(Arrays.asList(1,2,3));
    }
    @Test
    public void nothingTest() {
        Result result = computerBalls.makeResult(Arrays.asList(7,8,9));
        assertThat(result.getStrike()).isEqualTo(0);
        assertThat(result.getBall()).isEqualTo(0);
    }
    @Test
    public void strike1ball2Test() {
        Result result = computerBalls.makeResult(Arrays.asList(1,3,2));
        assertThat(result.getStrike()).isEqualTo(1);
        assertThat(result.getBall()).isEqualTo(2);
    }
    @Test
    public void strike3Test() {
        Result result = computerBalls.makeResult(Arrays.asList(1,2,3));
        assertThat(result.getStrike()).isEqualTo(3);
        assertThat(result.getBall()).isEqualTo(0);
    }
    @Test
    public void ball3Test() {
        Result result = computerBalls.makeResult(Arrays.asList(2,3,1));
        assertThat(result.getStrike()).isEqualTo(0);
        assertThat(result.getBall()).isEqualTo(3);
    }
}
