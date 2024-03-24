package org.github.fourth.desgin.pattern.behavioral.command;

public interface DataSource {
    void insert(String primaryKey);

    void update(String primaryKey);

    void delete(String primaryKey);
}
