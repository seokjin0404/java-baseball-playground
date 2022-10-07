package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }
    @Test
    void split() {
        String[] numbers = "1,2".split(",");
        assertThat(numbers).containsExactly("1","2");
        numbers = "1".split(",");
        assertThat(numbers).contains("1");
    }
    @Test
    void substring() {
        String numbers = "(1,2)".substring(1,4);
        assertThat(numbers).isEqualTo("1,2");
    }
    @Test
    @DisplayName("Test StringIndexOutOfBoundsException")
    void charAt() {
        String values = "abc";
        int input = 4;

        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    char chr = values.charAt(input);
                });
    }
}
