package domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class BallCountTest {
    @Test
    public void countTestUnder() {
        assertThatThrownBy(()->{
            new Balls(Arrays.asList(1,2));
        }).isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    public void countTestOver() {
        assertThatThrownBy(()->{
            new Balls(Arrays.asList(1,2,3,4));
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
