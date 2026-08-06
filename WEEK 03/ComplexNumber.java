public class ComplexNumber{
    private double real;
    private double imaginary;

    private static int count=0;
    public ComplexNumber(){
        this.real=0;
        this.imaginary=0;
        count++;
    }
    public ComplexNumber(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
        count++;
    }
    public ComplexNumber(ComplexNumber c){
        this.real=c.real;
        this.imaginary=c.imaginary;
        count++;
    }
    public static int objectCount(){
        return count;
    }
    public void set(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;

    }
    public double getReal(){
        return this.real;
    }
    public double getImaginary(){
        return this.imaginary;
    }

    public ComplexNumber add(ComplexNumber c) {
    return new ComplexNumber(this.real + c.real, this.imaginary + c.imaginary);
    }

    public ComplexNumber subtract(ComplexNumber c) {
    return new ComplexNumber(this.real - c.real, this.imaginary - c.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber c) {
    double realPart = (this.real * c.real) - (this.imaginary * c.imaginary);
    double imaginaryPart = (this.real * c.imaginary) + (this.imaginary * c.real);
    return new ComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumber divide(ComplexNumber c) {
    double denominator = (c.real * c.real) + (c.imaginary * c.imaginary);
    double realPart = ((this.real * c.real) + (this.imaginary * c.imaginary)) / denominator;
    double imaginaryPart = ((this.imaginary * c.real) - (this.real * c.imaginary)) / denominator;
    return new ComplexNumber(realPart, imaginaryPart);
    }


    public void display(){
        System.out.println("real:"+ this.real);
        System.out.println("imaginary:"+this.imaginary);
    }
    @Override
    public String toString(){
         return real + " + " + imaginary + "i";
    }
}