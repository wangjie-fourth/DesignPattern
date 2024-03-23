package org.github.fourth.desgin.pattern.creational.singleton.lazyEnum;

public enum Singleton {
    INSTANCE("name");

    private String name;

    Singleton(String name) {
        this.name = name;
    }
    // 业务方法

}
