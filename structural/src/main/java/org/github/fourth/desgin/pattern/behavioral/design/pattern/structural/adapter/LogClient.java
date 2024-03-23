package org.github.fourth.desgin.pattern.behavioral.design.pattern.structural.adapter;


public class LogClient {

    public static void main(String[] args) {
        Log log = new Log();
        log.setLogId("1");
        log.setUserId("mi");
        LogFileManager logFile = new LogFileManagerImpl("filename");

        LogDAO logDAO = new LogAdapter(logFile);
        logDAO.createLog(log);


    }
}
