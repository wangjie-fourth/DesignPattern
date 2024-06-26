package org.github.fourth.desgin.pattern.behavioral.design.pattern.structural.decorator.then;


import org.github.fourth.desgin.pattern.behavioral.design.pattern.structural.decorator.after.DecoratorStream;

public class AsciiFileStream extends DecoratorStream {

    public AsciiFileStream(Stream stream) {
        super(stream);
    }

    @Override
    public char read(int position) {
        char result = super.read(position);
        return transferToAscii(result);
    }

    private char transferToAscii(char result) {
        // 换字符集操作
        return 0;
    }

    @Override
    public void write(char data) {
        super.write(data);
    }
}
