package org.github.fourth.desgin.pattern.creational.singleton.lazyUnsafe;

public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public Singleton getINSTANCE() {
        if (instance == null) {
            instance = new Singleton();
            return instance;
        }
        return instance;
    }

    // 业务方法
}
