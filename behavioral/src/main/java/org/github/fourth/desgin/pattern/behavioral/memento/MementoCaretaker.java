package org.github.fourth.desgin.pattern.behavioral.memento;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@SuppressFBWarnings("EI_EXPOSE_REP2")
public class MementoCaretaker {

    private Map<String, List<AttributeValue>> maps = new ConcurrentHashMap<>();

    public void setMemento(String key, AttributeValue value) {
        if (maps.containsKey(key)) {
            maps.get(key).add(value);
        } else {
            List<AttributeValue> values = new ArrayList<>();
            values.add(value);
            maps.put(key, values);
        }
    }

    public AttributeValue findMemento(String key, int version) throws IllegalAccessException {
        if (!maps.containsKey(key) || version >= maps.get(key).size()) {
            throw new IllegalAccessException("There is no related backup for key");
        }
        return maps.get(key).get(version);
    }
}
