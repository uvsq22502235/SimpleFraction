package com.example.TD1;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2,4);
        Fraction f2 = new Fraction(1,4);
        Fraction f3 = f1.add(f2);
        assert f3.doubleValue()==0.75;
        System.out.println("add() marchent bien! ");
    }
}
