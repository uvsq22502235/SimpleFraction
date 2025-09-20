package com.example.TD1;

public class Fraction extends Number implements Comparable<Fraction>{
    @Override
    public String toString() {
        return numerateur + "/" + denominateur;
    }

    // Définition des attributs
    private int numerateur;
    private int denominateur;

    // Définition des constructeurs
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

    // Définition des constantes
    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction UN = new Fraction(1, 1);

    // Définition des getters
    public int getNumerateur() {
        return numerateur;
    }

    public int getDenominateur() {
        return denominateur;
    }

    @Override
    public int intValue() {
        return numerateur / denominateur;
    }

    @Override
    public float floatValue() {
        return (float) numerateur / denominateur;
    }

    @Override
    public long longValue() {
        return (long) numerateur / denominateur;
    }

    @Override
    public double doubleValue() {
        return (double) numerateur / denominateur;
    }

    public Fraction add(Fraction f) {
        int Newnum = this.numerateur * f.denominateur + this.denominateur * f.numerateur;
        int Newden = this.denominateur * f.denominateur;
        return new Fraction(Newnum, Newden);
    }

    private void reduire() {
        int a = numerateur;
        int b = denominateur;
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        int gcd = a; 
        numerateur /= gcd;
        denominateur /= gcd;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fraction f1 = this;
        Fraction f2 = (Fraction) obj;
        f1.reduire();
        f2.reduire();
        return f1.numerateur == f2.numerateur &&
                f1.denominateur == f2.denominateur;
    }

    @Override
    public int compareTo(Fraction f) {
        int diff=this.numerateur*f.denominateur-this.denominateur*f.numerateur;
        if(diff<0) return -1;
        if(diff>0) return 1;
        return 0;
    }

}
