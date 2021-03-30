package org.kurtlike.elements;

import javafx.scene.control.TextArea;

import java.util.ArrayList;

public class Console {
    public static void writeLine(TextArea console,String str){
        console.appendText(str+ "\n");
    }
    public static void writeAnswer(TextArea console, Number answer){
        console.appendText("x = " + answer + "\n");
    }

}
