package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class BallNumberTest {

    @Test
    public void numberValid() {
        assertThatThrownBy(() -> {
            new BallNumber(0);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
