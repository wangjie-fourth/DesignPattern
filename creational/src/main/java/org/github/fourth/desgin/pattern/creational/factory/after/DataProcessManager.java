package org.github.fourth.desgin.pattern.creational.factory.after;


import org.github.fourth.desgin.pattern.creational.factory.after.function.DataReader;
import org.github.fourth.desgin.pattern.creational.factory.after.function.FileDataReader;
import org.github.fourth.desgin.pattern.creational.factory.after.function.MySQLDataReader;

public class DataProcessManager {

    public void processData(DataReader dataReader) {
        String data = dataReader.get();

        // processing data
        System.out.println("Data process : " + data);
    }

    @Deprecated
    public void processDataFromFile() {
        // get data
        DataReader dataReader = new FileDataReader();
        String data = dataReader.get();

        // processing data
        System.out.println("Data process : " + data);
    }

    @Deprecated
    public void processDataFromMySQL() {
        // get data
        DataReader dataReader = new MySQLDataReader();
        String data = dataReader.get();

        //processing data
        System.out.println("Data process : " + data);
    }
}
