package com.example.TD1;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,4);
        assert f1.getNumerateur() == 3;
        assert f1.getDenominateur() == 4;
        System.out.println("Tout les getters marchent bien! ");
    }
}
