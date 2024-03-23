package org.github.fourth.desgin.pattern.creational.factory.after.factorys;


import org.github.fourth.desgin.pattern.creational.factory.after.function.DataReader;
import org.github.fourth.desgin.pattern.creational.factory.after.function.FileDataReader;

public class FileDataReaderFactory implements DataReaderFactory {
    @Override
    public DataReader createDataReader() {
        return new FileDataReader();
    }
}
