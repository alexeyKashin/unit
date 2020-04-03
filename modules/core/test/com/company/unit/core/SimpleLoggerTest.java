package com.company.unit.core;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class SimpleLoggerTest {
    private final Logger log = LoggerFactory.getLogger(SimpleLoggerTest.class);
    private SimpleLogger simpleLogger = new SimpleLogger();

    @Test
    void differentLoggings() {
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
        simpleLogger.differentLoggings();
    }
}