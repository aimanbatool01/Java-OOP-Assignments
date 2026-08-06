public class MainRational {
    public static void main(String[] args) {

        RationalNumber r1 = new RationalNumber();
        RationalNumber r2 = new RationalNumber(1, 2);
        RationalNumber r3 = new RationalNumber(1,3);     
        RationalNumber r4 = new RationalNumber(r2);   

        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.println("r3: " + r3);
        System.out.println("r4: " + r4);

        r2.display();

        System.out.println("Add: " + r2.add(r3));
        System.out.println("Subtract: " + r2.subtract(r3));
        System.out.println("Multiply: " + r2.multiply(r3));
        System.out.println("Divide: " + r2.divide(r3));

        r1.set(5, 6);
        System.out.println("After set: " + r1);

        System.out.println("Numerator: " + r2.getNumerator());
        System.out.println("Denominator: " + r2.getDenominator());

        System.out.println("Total Objects: "+ RationalNumber.objectCount());
    }
}