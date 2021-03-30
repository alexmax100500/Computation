package org.kurtlike.elements.abctract;

import javafx.scene.control.TextField;

public abstract class MyAbstractTextField {
    protected TextField textField;
    public MyAbstractTextField(TextField textField){
        this.textField = textField;
    }
    public abstract void setText(String text);

    public abstract String getText();
}
