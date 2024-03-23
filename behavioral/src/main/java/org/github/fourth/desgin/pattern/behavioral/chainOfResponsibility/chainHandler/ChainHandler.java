package org.github.fourth.desgin.pattern.behavioral.chainOfResponsibility.chainHandler;


public interface ChainHandler {

    void handle(ConfigContext context);

    boolean canProcess(ConfigContext configContext);
}
