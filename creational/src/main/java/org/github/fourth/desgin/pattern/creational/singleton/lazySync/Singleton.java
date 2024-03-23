package org.github.fourth.desgin.pattern.creational.singleton.lazySync;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    @SuppressFBWarnings("SSD_DO_NOT_USE_INSTANCE_LOCK_ON_SHARED_STATIC_DATA")
    public synchronized Singleton getINSTANCE() {
        if (instance == null) {
            instance = new Singleton();
            return instance;
        }
        return instance;
    }

    // 业务方法
}
