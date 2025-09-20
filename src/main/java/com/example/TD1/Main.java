package com.example.TD1;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        Fraction f3 = new Fraction(3, 4);
        assert f1.compareTo(f2) == 0;   
        assert f1.compareTo(f3) < 0;    
        assert f3.compareTo(f1) > 0;    
        System.out.println("compareTo() marche bien !");
    }
}
