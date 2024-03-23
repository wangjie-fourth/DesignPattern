package org.github.fourth.desgin.pattern.behavioral.design.pattern.structural.decorator.after;

import org.github.fourth.desgin.pattern.behavioral.design.pattern.structural.decorator.then.Stream;
/**
 * 在工作中，可能不会有这一层
 */
public abstract class DecoratorStream implements Stream {
    private Stream stream;

    protected DecoratorStream(final Stream stream) {
        this.stream = stream;
    }

    @Override
    public char read(int position) {
        return stream.read(position);
    }

    @Override
    public void write(char data) {
        stream.write(data);
    }
}
