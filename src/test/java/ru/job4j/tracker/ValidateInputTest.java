package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.ValidateInput;
import ru.job4j.tracker.input.MockInput;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.StubOutput;

public class ValidateInputTest {
    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"one", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"812"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(812);
    }

    @Test
    void whenValidMultiplyInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"812", "3", "5", "4", "6"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int[] expected = {812, 3, 5, 4, 6};
        for (int i : expected) {
            int selected = input.askInt("Enter menu:");
            assertThat(selected).isEqualTo(i);
        }
    }

    @Test
    void whenValidMinusInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"-9"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-9);
    }
}
