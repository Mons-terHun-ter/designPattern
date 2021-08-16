package com.learn.singleton;

import java.util.function.Function;

public class Singleton02 {
    public static void main(String[] args) {
        FullPattern fullPattern = FullPattern.getFullPattern();
        FullPattern fullPattern1 = FullPattern.getFullPattern();
        System.out.println(fullPattern1 == fullPattern);

    }
}

/**
 * 懒汉模式
 */
class FullPattern {
    private FullPattern() {

    }

    private static FullPattern fullPattern = null;

    public static FullPattern getFullPattern() {
        if (fullPattern == null) {
            fullPattern = new FullPattern();
        }
        return fullPattern;
    }
}
