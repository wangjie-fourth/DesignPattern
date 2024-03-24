package org.github.fourth.desgin.pattern.behavioral.command;

public class InsertCommand extends AbstractCommand {
    public InsertCommand(String primaryKey) {
        super(primaryKey);
    }

    @Override
    public void execute() {
        dataSource.insert(primaryKey);
    }

    @Override
    public void undo() {
        System.out.println("Undo insert command from " + this.dataSource);
    }
}
