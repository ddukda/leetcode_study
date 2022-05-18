package com.test.spring.strategy.code2;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class Context2 {
    public void template(Strategy2 strategy) {
        long start = System.currentTimeMillis();

        strategy.logic();

        log.info("time -> {}ms", System.currentTimeMillis() - start);
    }
}
