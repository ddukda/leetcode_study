package com.test.spring.strategy.code;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class Context {

    private final Strategy strategy;

    public void template() {
        long start = System.currentTimeMillis();

        strategy.logic();

        log.info("time -> {}ms", System.currentTimeMillis() - start);
    }
}
