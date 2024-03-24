package org.github.fourth.desgin.pattern.behavioral.design.pattern.structural.decorator.before;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/**
 * 外界同这个类使用Stream信息
 */
@SuppressFBWarnings("EI_EXPOSE_REP2")
public class Client {

    private final Stream stream;

    public Client(Stream stream) {
        this.stream = stream;
    }

    public static void main(String[] args) {

    }
}
