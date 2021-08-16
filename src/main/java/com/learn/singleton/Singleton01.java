package com.learn.singleton;

public class Singleton01 {
    public static void main(String[] args) {
        EagerPattern eagerPattern = EagerPattern.getEagerPattern();
        EagerPattern eagerPattern1 = EagerPattern.getEagerPattern();
        System.out.println(eagerPattern1 == eagerPattern);


    }
}

/**
 * 饿汉模式
 */
class EagerPattern {
    private static EagerPattern eagerPattern = new EagerPattern();

    private EagerPattern() {

    }


    public static EagerPattern getEagerPattern() {
        return eagerPattern;
    }
}
