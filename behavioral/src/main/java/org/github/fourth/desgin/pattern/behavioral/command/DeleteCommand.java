package org.github.fourth.desgin.pattern.behavioral.command;

public class DeleteCommand extends AbstractCommand {
    public DeleteCommand(String primaryKey) {
        super(primaryKey);
    }

    @Override
    public void execute() {
        dataSource.delete(primaryKey);
    }

    @Override
    public void undo() {
        System.out.println("Undo delete command from " + this.dataSource);
    }
}
