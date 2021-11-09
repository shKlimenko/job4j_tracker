package ru.job4j.tracker;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {
    @Test
    public void whenInputIsInvalid() {
        Output out = new StubOutput();
        Input in = new StubInput(
               List.of("one", "1")
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenInputIsValid() {
        Output out = new StubOutput();
        Input in = new StubInput(
                List.of("7")
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(7));
    }

    @Test
    public void whenMultipleInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                List.of("3", "2", "1")
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(3));
        selected = input.askInt("Enter menu:");
        assertThat(selected, is(2));
        selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenInputIsNegative() {
        Output out = new StubOutput();
        Input in = new StubInput(
                List.of("-7")
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(-7));
    }
}