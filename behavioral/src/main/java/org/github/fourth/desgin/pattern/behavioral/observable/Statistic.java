package org.github.fourth.desgin.pattern.behavioral.observable;

public class Statistic implements Component {
    @Override
    public void show(String data) {
        System.out.println("Statistic = " + data);
    }
}
