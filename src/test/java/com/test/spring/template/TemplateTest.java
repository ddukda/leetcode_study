package com.test.spring.template;

import com.test.spring.template.code.TemplateClass;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TemplateTest {


    @Test
    void test() {
        TemplateClass templateClass = new TemplateClass() {
            @Override
            public void logic() {
                log.info("비즈니스 로직 1");
            }
        };

        log.info("start");
        templateClass.template();
    }
}
