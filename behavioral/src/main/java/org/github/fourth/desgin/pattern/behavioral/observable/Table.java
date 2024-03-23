package org.github.fourth.desgin.pattern.behavioral.observable;

public class Table implements Component{

    @Override
    public void show(String currentData) {
        System.out.println("currentData = " + currentData);
    }
}
