package com.company.unit.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleLogger {
    private final Logger log = LoggerFactory.getLogger(SimpleLogger.class);


    public void differentLoggings() {
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
    }
}
