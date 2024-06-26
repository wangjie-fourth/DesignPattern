package org.github.fourth.desgin.pattern.behavioral.design.pattern.structural.decorator.after;

import org.github.fourth.desgin.pattern.behavioral.design.pattern.structural.decorator.then.Stream;

public class AsciiStream extends DecoratorStream {

    public AsciiStream(Stream stream) {
        super(stream);
    }

    @Override
    public char read(int position) {
        char result = super.read(position);
        // extra work
        return transferToAscii(result);
    }

    @Override
    public void write(char data) {
        // extra work
        super.write(data);
    }

    private char transferToAscii(char result) {
        // 换字符集操作
        return 0;
    }
}
