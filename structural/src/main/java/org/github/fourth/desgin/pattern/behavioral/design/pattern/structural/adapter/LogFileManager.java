package org.github.fourth.desgin.pattern.behavioral.design.pattern.structural.adapter;

import java.util.List;

public interface LogFileManager {


    List<Log> readLog();

    void writeLogIntoFile(List<Log> log);

}
