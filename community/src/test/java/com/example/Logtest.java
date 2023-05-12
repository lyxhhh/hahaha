package com.example;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
@Slf4j
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class Logtest {
    @Test
    public void testlogback(){
        log.debug("debug日志");
        log.info("info日志");
        log.warn("warn日志");
        log.error("error日志");
    }
}
