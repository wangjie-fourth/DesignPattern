package org.github.fourth.desgin.pattern.creational.factory.after.function;

public class MySQLDataReader implements DataReader {
    @Override
    public String get() {
        return "MySQL Data";
    }
}
