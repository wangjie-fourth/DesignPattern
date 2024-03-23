package org.github.fourth.desgin.pattern.creational.factory.after.factorys;


import org.github.fourth.desgin.pattern.creational.factory.after.function.DataReader;
import org.github.fourth.desgin.pattern.creational.factory.after.function.MySQLDataReader;

public class MySQLDataReaderFactory implements DataReaderFactory {

    @Override
    public DataReader createDataReader() {
        return new MySQLDataReader();
    }
}
