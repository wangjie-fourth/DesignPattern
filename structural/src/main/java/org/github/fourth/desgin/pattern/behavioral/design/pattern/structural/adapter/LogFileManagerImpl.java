package org.github.fourth.desgin.pattern.behavioral.design.pattern.structural.adapter;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.util.List;

@SuppressFBWarnings("URF_UNREAD_FIELD")
public class LogFileManagerImpl implements LogFileManager {
    private String fileName;

    public LogFileManagerImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Log> readLog() {
        return null;
    }

    @Override
    public void writeLogIntoFile(List<Log> log) {

    }
}
