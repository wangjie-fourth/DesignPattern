package org.github.fourth.desgin.pattern.behavioral.design.pattern.structural.decorator.after;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

@SuppressFBWarnings("EI_EXPOSE_REP2")
public class CompressStream implements Stream {

    private final Stream stream;

    public CompressStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public char read(int position) {
        // extra work
        return stream.read(position);
    }

    @Override
    public void write(char data) {
        // extra work
        char result = compress(data);
        stream.write(result);
    }

    private char compress(char data) {
        return 'a';
    }
}
