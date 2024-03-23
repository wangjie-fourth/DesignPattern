package org.github.fourth.desgin.pattern.behavioral.design.pattern.structural.adapter;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.util.List;

@SuppressFBWarnings("EI_EXPOSE_REP2")
public class LogAdapter implements LogDAO {
    private LogFileManager adapter;

    public LogAdapter(LogFileManager adapter) {
        this.adapter = adapter;
    }

    @Override
    public void createLog(Log log) {
        List<Log> list = adapter.readLog();
        list.add(log);
        adapter.writeLogIntoFile(list);

        // db operation

    }
}
