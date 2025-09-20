package com.example.TD1;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        Fraction f3 = new Fraction(3, 4);
        assert f1.equals(f2);       
        assert !f1.equals(f3);    
        System.out.println("equals() marche bien !");
    }
}
