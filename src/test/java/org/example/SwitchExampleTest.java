package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * Created by mkwaczynski on 2016-07-26
 */
public class SwitchExampleTest {

    private final SwitchExample switchExample = new SwitchExample();

    @Test
    public void integerSwitchShouldReturnA() throws Exception {
        // given
        final Integer input = 1;

        // when
        final String result = switchExample.switchInteger(input);

        // then
        assertThat(result).isEqualTo("A");
    }

    @Test
    public void integerSwitchShouldReturnB() throws Exception {
        // given
        final Integer input = 2;

        // when
        final String result = switchExample.switchInteger(input);

        // then
        assertThat(result).isEqualTo("B");
    }

    @Test(expected = IllegalArgumentException.class)
    public void integerSwitchShouldThrowIllegalArgumentException1() throws Exception {
        // given
        final Integer input = 0;

        // when
        switchExample.switchInteger(input);

        // then
        // exception
    }

    @Test
    public void stringSwitchShouldReturnA() throws Exception {
        // given
        final String input = "a";

        // when
        final String result = switchExample.switchString(input);

        // then
        assertThat(result).isEqualTo("A");
    }

    @Test
    public void stringSwitchShouldReturnB() throws Exception {
        // given
        final String input = "b";

        // when
        final String result = switchExample.switchString(input);

        // then
        assertThat(result).isEqualTo("B");
    }

    @Test(expected = IllegalArgumentException.class)
    public void stringSwitchShouldThrowIllegalArgumentException() throws Exception {
        // given
        final String input = "c";

        // when
        switchExample.switchString(input);

        // then
        // exception
    }
}
