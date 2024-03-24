package org.github.fourth.desgin.pattern.behavioral.observable;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.util.List;

@SuppressFBWarnings("EI_EXPOSE_REP2")
public class Subject {
    private String data;

    private List<Component> componentList;

    public Subject(List<Component> componentList) {
        this.componentList = componentList;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void refresh(String currentData) {
        setData(currentData);
        this.componentList.forEach(item -> item.show(currentData));
    }

    public void addComponent(Component component) {
        this.componentList.add(component);
    }


}
