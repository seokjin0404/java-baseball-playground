package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ballTest {

    Ball computer;
    @BeforeEach
    public void setUp() {
        computer = new Ball(2, 3);
    }

    @Test
    public void ball() {
        Referee result = computer.play(new Ball(1,3));
        assertThat(result).isEqualTo(Referee.Ball);
    }
    @Test
    public void strike() {
        Referee result = computer.play(new Ball(2,3));
        assertThat(result).isEqualTo(Referee.Strike);
    }
    @Test
    public void nothing() {
        Referee result = computer.play(new Ball(1,2));
        assertThat(result).isEqualTo(Referee.Nothing);
    }

}
