package org.kurtlike;

import org.kurtlike.elements.interfaces.Manageable;

import java.util.HashMap;

public class Test implements Manageable<String,String> {
    Double [][]dots = {{-1.1,-1.2},{0.1,0.2},{2.1,2.2}};
    Double []dot = {-1.3,-2.1};
    HashMap<String,String> funk = new HashMap<>();
    HashMap<String,String> met = new HashMap<>();
    Double borderL,borderR;
    Double acc;
    int count = 6;
    @Override
    public HashMap<String, String> getFunctions() {
        funk.put("1","x^3−2,92x^2+1,435x+0,791");
        funk.put("2","f = a^2+1");
        funk.put("3","f = a^2+a+1");
        return funk;
    }

    @Override
    public HashMap<String, String> getMethods() {
        met.put("1","уебищный");
        met.put("2","отвратительный");
        return met;
    }

    @Override
    public void setBorders(Number left, Number right) {
        borderL = (Double) left;
        borderR = (Double) right;
    }

    @Override
    public void setAccuracy(Number accuracy) {
        acc = (Double) accuracy;
    }

    @Override
    public void setChosenFunction(String s) {
        System.out.println(funk.entrySet());
        System.out.println(s);
        System.out.println(funk.get(s));
    }

    @Override
    public void setChosenMethod(String s) {
        System.out.println(met.get(s));
    }

    @Override
    public Number[][] getFuncDots() {
        for (Double []d:dots){
            d[0] += 0.3;
            d[1] += 0.3;
        }
        return dots;
    }

    @Override
    public String getFuncName() {
        return "asda";
    }

    @Override
    public Number[] getNextApproximationDot() {
        dot[0] += 0.3;
        dot[1] += 0.3;
        return dot;
    }

    @Override
    public String getApproximationDotsName() {
        return "asda";
    }

    @Override
    public Number getAnswer() {
        return 2;
    }

    @Override
    public String getAnswersNote() {
        return "asd";
    }

    @Override
    public boolean isEnd() {
        count--;
        return count < 0;
    }
}
