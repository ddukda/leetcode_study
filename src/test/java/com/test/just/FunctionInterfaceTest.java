package com.test.just;

import org.junit.jupiter.api.Test;

import java.util.function.BinaryOperator;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class FunctionInterfaceTest {

    @Test
    void sum() {
        BinaryOperator<Integer> operator = Integer::sum;
        int sum = operator.apply(1, 2);
        assertThat(sum).isEqualTo(3);
    }

    @Test
    void dividing() {
        BinaryOperator<Integer> operator = Integer::divideUnsigned;
        int divide = operator.apply(6, 3);
        assertThat(divide).isEqualTo(2);
    }
}
