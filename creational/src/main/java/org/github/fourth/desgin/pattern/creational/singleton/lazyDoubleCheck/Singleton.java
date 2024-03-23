package org.github.fourth.desgin.pattern.creational.singleton.lazyDoubleCheck;

public class Singleton {
    private volatile static Singleton instance;

    private Singleton() {

    }

    public Singleton getINSTANCE() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    return new Singleton();
                }
            }
        }
        return instance;
    }

    // 业务方法
}
