package com.test.spring.template.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class TemplateClass {

    public void template() {
        long start = System.currentTimeMillis();

        logic();

        log.info("time -> {}ms", System.currentTimeMillis()-start);
    }

    public abstract void logic();
}
