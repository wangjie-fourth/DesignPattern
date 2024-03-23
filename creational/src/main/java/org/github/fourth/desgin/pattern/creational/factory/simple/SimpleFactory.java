package org.github.fourth.desgin.pattern.creational.factory.simple;


import org.github.fourth.desgin.pattern.creational.factory.simple.function.DataReader;
import org.github.fourth.desgin.pattern.creational.factory.simple.function.FileDataReader;
import org.github.fourth.desgin.pattern.creational.factory.simple.function.MySQLDataReader;

public class SimpleFactory {
    public DataReader getDataReader(String type) {
        switch (type) {
            case "MYSQL":
                return new MySQLDataReader();
            case "File":
                return new FileDataReader();
            default:
                return null;
        }
    }
}
