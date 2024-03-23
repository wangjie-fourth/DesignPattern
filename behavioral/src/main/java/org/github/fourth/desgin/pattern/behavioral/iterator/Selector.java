package org.github.fourth.desgin.pattern.behavioral.iterator;

public interface Selector {

    boolean hasNext();

    Object getCurrentItem();

    void next();

}
