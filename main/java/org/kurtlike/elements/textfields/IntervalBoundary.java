package org.kurtlike.elements.textfields;

import javafx.scene.control.TextField;
import org.kurtlike.elements.abctract.MyAbstractTextField;
import org.kurtlike.elements.interfaces.Visible;

public class IntervalBoundary extends MyAbstractTextField implements Visible {
    public IntervalBoundary(TextField textField) {
        super(textField);
    }
    public double getBorder() throws NumberFormatException{
        return Double.parseDouble(getText());
    }
    @Override
    public void setText(String text) {
        super.textField.setText(text);
    }

    @Override
    public String getText() {
        return super.textField.getText();
    }

    @Override
    public boolean isVisible() {
        return super.textField.isVisible();
    }

    @Override
    public void setVisible(boolean visible) {
        super.textField.setVisible(visible);
    }
}
