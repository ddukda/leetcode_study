package com.test.spring.strategy;

import com.test.spring.strategy.code.Strategy;
import com.test.spring.strategy.code.Context;
import com.test.spring.strategy.code2.Context2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class StrategyTest {

    @Test
    void test() {
        Strategy strategy = () -> log.info("비즈니스 로직");

        Context context = new Context(strategy);
        context.template();
    }

    @Test
    void test2() {
        Context2 context2 = new Context2();
        context2.template(() -> log.info("비즈니스 로직"));
    }
}
