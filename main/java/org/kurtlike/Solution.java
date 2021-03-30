package org.kurtlike;

import static java.lang.Math.*;

public class Solution {
    String method, function;
    Number[] point = new Number[2];
    double x, x0;
    double accurancy, left, right;
    boolean isEnd;
    boolean getIsEnd() {
        return isEnd;
    }
    double fun1(double x) {
        return pow(x, 3) - 2.92 * pow(x, 2) + 1.435 * x + 0.791;
    }

    double fun2(double x) {
        return tan(x) * x - x;
    }

    double fun3(double x) {
        return (Math.exp(-x) * pow(x, 3) - 0.4 * x);
    }

    void checkInterval(double left, double right) {
        if (left * right > 0) {
            isEnd = true;
        }
    }

    public void setBorders(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public Number[] Hords() {
        switch (function) {
            case ("1"):
                x = right * (left - right) / (fun1(left)-fun1(right))*fun1(right);
                System.out.println(x+" X\n");
                if(abs(x-right)<accurancy){
                    isEnd=true;
                }
                right=x;
                point[0]=x;
                point[1]=fun1(x);
                break;
            case ("2"):
                x0 = right;
                x = right * (left - right) / (fun2(left)-fun2(right))*fun2(right);
                if(abs(x-right)<accurancy){
                    isEnd=true;
                }
                right=x;
                point[0]=x;
                point[1]=fun2(x);
                break;
            case ("3"):
                x0 = right;
                x = right * (left - right) / (fun3(left)-fun3(right))*fun3(right);
                if(abs(x-right)<accurancy){
                    isEnd=true;
                }
                right=x;
                point[0]=x;
                point[1]=fun3(x);
                break;
        }

        return point;
    }
}