package com.example.TD1;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,4);
        assert f1.toString().equals("3/4");
        Fraction f2 = new Fraction(3);
        assert f2.toString().equals("3/1");
        Fraction f3 = new Fraction();
        assert f3.toString().equals("0/1");
        System.out.println("Tout les constructeurs marchent bien! ");
    }
}
