package com.test.study_leetcode.roman;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
public class RomanToIntegerTest {

    @Test
    void test() {
        Assertions.assertEquals(1, logic("I"));
        Assertions.assertEquals(5, logic("V"));
        Assertions.assertEquals(3, logic("III"));
        Assertions.assertEquals(12, logic("XII"));
        Assertions.assertEquals(4, logic("IV"));
        Assertions.assertEquals(9, logic("IX"));
        Assertions.assertEquals(1994, logic("MCMXCIV"));
    }

    private Integer logic(String s) {
        Integer sum = 0;
        Integer beforeNum = 0;
        for (char c : s.toCharArray()) {
            Integer num = RomanNumber.getNum(String.valueOf(c)).getValue();
            if (beforeNum < num) {
                num = num - (beforeNum * 2);
            }
            beforeNum = num;
            sum += num;
        }
        return sum;
    }

    public enum RomanNumber {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);

        private Integer number;

        RomanNumber(int number) {
            this.number = number;
        }

        public Integer getValue() {
            return this.number;
        }

        public static RomanNumber getNum(String s) {
            return RomanNumber.valueOf(s);
        }

    }
}
