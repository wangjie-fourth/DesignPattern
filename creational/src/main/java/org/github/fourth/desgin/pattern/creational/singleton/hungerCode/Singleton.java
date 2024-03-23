package org.github.fourth.desgin.pattern.creational.singleton.hungerCode;

public class Singleton {
    public static final Singleton INSTANCE;

    static {
        // 初始化单例对象
        INSTANCE = new Singleton();
    }

    private Singleton() {

    }

    // 可有可无，因为上面单例对象是public
    public static Singleton getInstance() {
        return INSTANCE;
    }

    // 业务方法
}
