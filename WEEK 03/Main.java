public class Main {
    public static void main(String[] args){
        ComplexNumber c1 = new ComplexNumber();
        ComplexNumber c2 = new ComplexNumber(3, 4);
        ComplexNumber c3 = new ComplexNumber(c2);

        c1.display();
        c2.display();
        c3.display();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("Add: " + c2.add(c3));
        System.out.println("Subtract: " + c2.subtract(c3));
        System.out.println("Multiply: " + c2.multiply(c3));
        System.out.println("Divide: " + c2.divide(c3));

        c1.set(5, 6);
        System.out.println("After set: " + c1);

        System.out.println("Real: " + c2.getReal());
        System.out.println("Imaginary: " + c2.getImaginary());
        
        System.out.println("object count:"+ ComplexNumber.objectCount());
    }
}
