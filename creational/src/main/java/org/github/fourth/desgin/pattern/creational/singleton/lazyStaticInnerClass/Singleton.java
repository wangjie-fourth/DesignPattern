package org.github.fourth.desgin.pattern.creational.singleton.lazyStaticInnerClass;

public class Singleton {
    private Singleton() {

    }

    /**
     * 只要获取这个单例对象时，对应的静态内部类才会被加载；
     */
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }
}
