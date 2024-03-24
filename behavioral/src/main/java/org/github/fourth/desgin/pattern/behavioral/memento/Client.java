package org.github.fourth.desgin.pattern.behavioral.memento;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

@SuppressFBWarnings({"UC_USELESS_VOID_METHOD", "UC_USELESS_OBJECT", "DLS_DEAD_LOCAL_STORE"})
public class Client {
    public static void main(String[] args) {
        MementoCaretaker mementoCaretaker = new MementoCaretaker();
        ConfigManager configManager = new ConfigManagerImpl(mementoCaretaker);


    }
}
