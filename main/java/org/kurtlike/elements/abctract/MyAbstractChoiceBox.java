package org.kurtlike.elements.abctract;

import javafx.scene.control.ChoiceBox;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class MyAbstractChoiceBox<Key,Value> {
    protected ChoiceBox<Value> choiceBox;
    protected HashMap<Key,Value> hashMap;
    protected Key selectedKey;
    public MyAbstractChoiceBox(ChoiceBox<Value> choiceBox) {
        this.choiceBox = choiceBox;
        hashMap = new HashMap<>();
    }
    public abstract Key getSelectedKey();
    public abstract void addField(Key key, Value value);
    public abstract void addAll(HashMap<Key,Value> hashMap);
    public abstract void deleteFieldByKey(Key key);
    public abstract void deleteFieldByValue(Value value);
    public abstract void deleteAll();
}
