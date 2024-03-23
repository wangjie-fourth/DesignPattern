package org.github.fourth.desgin.pattern.creational.singleton.hungerField;

public class Singleton {
    public static final Singleton INSATNCE = new Singleton();

    // 一定不能暴露构造器
    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSATNCE;
    }

    // 业务方法
    public static void main(String[] args) {

    }
}
