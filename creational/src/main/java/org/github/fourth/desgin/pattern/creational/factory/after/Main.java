package org.github.fourth.desgin.pattern.creational.factory.after;


import org.github.fourth.desgin.pattern.creational.factory.after.factorys.DataReaderFactory;
import org.github.fourth.desgin.pattern.creational.factory.after.factorys.MySQLDataReaderFactory;

public class Main {
    public static void main(String[] args) {
        DataReaderFactory factory = new MySQLDataReaderFactory();
        new DataProcessManager().processData(factory.createDataReader());
    }
}
