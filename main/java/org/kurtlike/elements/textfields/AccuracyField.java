package org.kurtlike.elements.textfields;

import javafx.scene.control.TextField;
import org.kurtlike.elements.abctract.MyAbstractTextField;

public class AccuracyField extends MyAbstractTextField {
    public AccuracyField(TextField textField) {
        super(textField);
    }
    public Double getAccuracy(){
        return Double.parseDouble(this.textField.getText());
    }
    @Override
    public void setText(String text) {
        this.textField.setText(text);
    }

    @Override
    public String getText() {
        return this.textField.getText();
    }
}
