package com.techouts.cj2;

import java.util.logging.Logger;

public class SwitchPatternMatching {
    private static final Logger logger = Logger.getLogger("SwitchPatternMatching");

    public static void main(String[] args) {
        Object obj = "Gemini";
        switch (obj) {
            case String s -> logger.info("String");
            case Integer i -> logger.info("Integer");
            case Boolean b -> logger.info("Boolean");
            default -> logger.info("Unknown Type");
        }
    }
}
