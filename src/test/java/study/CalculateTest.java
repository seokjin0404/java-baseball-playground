package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateTest {

    private Calculator cal;
    @BeforeEach
    void setUp() {
        cal = new Calculator();
    }

    @Test
    @DisplayName("문자열 계산기")
    void calculateTest() {
        String input = "2 + 3 * 4 / 2";
        int result = cal.calculate(input);
        assertThat(result).isEqualTo(10);
    }
}
