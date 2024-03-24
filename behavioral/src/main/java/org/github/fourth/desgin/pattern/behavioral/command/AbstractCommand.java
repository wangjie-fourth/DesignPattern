package org.github.fourth.desgin.pattern.behavioral.command;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

@SuppressFBWarnings("EI_EXPOSE_REP2")
public abstract class AbstractCommand implements Command {
    protected String primaryKey;
    protected DataSource dataSource;

    public AbstractCommand(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public abstract void execute();

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }
}
