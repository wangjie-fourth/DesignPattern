package org.github.fourth.desgin.pattern.behavioral.command;

public class UpdateCommand extends AbstractCommand {
    public UpdateCommand(String primaryKey) {
        super(primaryKey);
    }

    @Override
    public void execute() {
        this.dataSource.update(this.primaryKey);
    }

    @Override
    public void undo() {
        System.out.println("Undo update command from " + this.dataSource);
    }
}
