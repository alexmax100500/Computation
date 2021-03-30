package org.kurtlike.elements.interfaces;

import java.util.HashMap;

public interface Manageable<Key,Value> {
    public HashMap<Key,Value> getFunctions();
    public HashMap<Key,Value> getMethods();
    public void setBorders(Number left, Number right);
    public void setAccuracy(Number accuracy);
    public void setChosenFunction(Key key);
    public void setChosenMethod(Key key);
    public Number[][] getFuncDots();
    public String getFuncName();
    public Number[] getNextApproximationDot();
    public String getApproximationDotsName();
    public Number getAnswer();
    public String getAnswersNote();
    public boolean isEnd();
}
