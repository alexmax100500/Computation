package org.kurtlike.elements.choiceboxes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.kurtlike.elements.abctract.MyAbstractChoiceBox;
import org.kurtlike.elements.interfaces.Visible;

import java.util.HashMap;

public class MyChoiceBox<Key, Value> extends MyAbstractChoiceBox<Key, Value> implements Visible {

    public MyChoiceBox(javafx.scene.control.ChoiceBox<Value> choiceBox) {
        super(choiceBox);
    }

    @Override
    public Key getSelectedKey() {
        return super.selectedKey;
    }
    @Override
    public void addField(Key key, Value value) {
        super.hashMap.put(key, value);
        super.choiceBox.setItems(FXCollections.observableArrayList(hashMap.values()));
    }

    @Override
    public void addAll(HashMap<Key, Value> hashMap) {
        super.hashMap.putAll(hashMap);
        super.choiceBox.setItems(FXCollections.observableArrayList(hashMap.values()));
    }

    @Override
    public void deleteFieldByKey(Key key) {
        super.hashMap.remove(key);
        super.choiceBox.setItems(FXCollections.observableArrayList(hashMap.values()));
    }

    @Override
    public void deleteFieldByValue(Value value) {
        for (Key key: hashMap.keySet()){
            if(value.equals(hashMap.get(key) )){
                hashMap.remove(key);
                break;
            }
        }
        super.choiceBox.setItems(FXCollections.observableArrayList(hashMap.values()));
    }

    @Override
    public void deleteAll() {
        super.hashMap.clear();
        super.choiceBox.setItems(FXCollections.observableArrayList(hashMap.values()));
    }

    @Override
    public boolean isVisible() {
        return super.choiceBox.isVisible();
    }

    @Override
    public void setVisible(boolean visible) {
        super.choiceBox.setVisible(visible);
    }
}
