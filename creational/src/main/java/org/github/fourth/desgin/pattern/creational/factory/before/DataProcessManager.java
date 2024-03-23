package org.github.fourth.desgin.pattern.creational.factory.before;


import org.github.fourth.desgin.pattern.creational.factory.before.function.DataReader;
import org.github.fourth.desgin.pattern.creational.factory.before.function.FileDataReader;
import org.github.fourth.desgin.pattern.creational.factory.before.function.MySQLDataReader;

public class DataProcessManager {

    // 如何解决下面创建FileDataReader、MySQLDataReader写死的代码呢？

    public void processDataFromFile() {
        // get data
        DataReader dataReader = new FileDataReader();
        String data = dataReader.get();

        // processing data
        System.out.println("Data process : " + data);
    }

    public void processDataFromMySQL() {
        // get data
        DataReader dataReader = new MySQLDataReader();
        String data = dataReader.get();

        //processing data
        System.out.println("Data process : " + data);
    }
}
