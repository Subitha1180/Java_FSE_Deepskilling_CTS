package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {

    private static final Logger logger = LoggerFactory.getLogger(LoggingDemo.class);

    public static void main(String[] args) {
        logger.info("Application started");

        try {
            int result = divide(10, 0);
        } catch (ArithmeticException e) {
            logger.error("An error occurred while dividing: {}", e.getMessage(), e);
        }

        logger.warn("This is a warning message about resource usage");
        logger.info("Application ended");
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
