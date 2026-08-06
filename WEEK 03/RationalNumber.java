public class RationalNumber {
    private int numerator;
    private int denominator;
    
    private static int count = 0;
    public RationalNumber() {
        this.numerator = 0;
        this.denominator = 1;
        count++;
    }

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        count++;
    }

    public RationalNumber(RationalNumber r) {
        this.numerator = r.numerator;
        this.denominator = r.denominator;
        count++;
    }

    public static int objectCount() {
        return count;
    }

    public void set(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }
    
    public RationalNumber add(RationalNumber r) {
        int num = (this.numerator * r.denominator) + (r.numerator * this.denominator);
        int den = this.denominator * r.denominator;
        return new RationalNumber(num, den);
    }

    public RationalNumber subtract(RationalNumber r) {
        int num = (this.numerator * r.denominator) - (r.numerator * this.denominator);
        int den = this.denominator * r.denominator;
        return new RationalNumber(num, den);
    }

    public RationalNumber multiply(RationalNumber r) {
        int num = this.numerator * r.numerator;
        int den = this.denominator * r.denominator;
        return new RationalNumber(num, den);
    }

    public RationalNumber divide(RationalNumber r) {
        int num = this.numerator * r.denominator;
        int den = this.denominator * r.numerator;
        return new RationalNumber(num, den);
    }

    public void display() {
        System.out.println(numerator + "/" + denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}