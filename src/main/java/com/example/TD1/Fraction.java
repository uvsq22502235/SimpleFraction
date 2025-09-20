package com.example.TD1;

public class Fraction {
    @Override
    public String toString() {
        return numerateur + "/" + denominateur;
    }

    private int numerateur;
    private int denominateur;

    public Fraction(int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public Fraction(int numerateur) {
        this.numerateur = numerateur;
        this.denominateur = 1;
    }

    public Fraction() {
        this.numerateur = 0;
        this.denominateur = 1;
    }

    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction UN = new Fraction(1, 1);

    // Définition des getters
    public int getNumerateur() {
        return numerateur;
    }

    public int getDenominateur() {
        return denominateur;
    }
}
