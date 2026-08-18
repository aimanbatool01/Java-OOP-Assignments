public class MainCalculator {
    public static void main(String[]args){
        Calculator c1= new Calculator();
        Calculator c2= new Calculator(12.0,12.0);
        Calculator c3= new Calculator(c2);

        c1.display();
        System.out.println();
        c2.display();
        System.out.println();
        c3.display();
        System.out.println();
        c1.set(12,34);
        c1.display();
        System.out.println();

        System.out.println("Num1:"+c2.getNum1());
        System.out.println("Num2:"+c2.getNum2());
        System.out.println();
        System.out.println(c2);

        System.out.println("Add: " + c2.add());
        System.out.println("Subtract: " + c2.subtract());
        System.out.println("Multiply: " + c2.multiply());
        System.out.println("Divide: " + c2.divide());

        System.out.println("ObjectCount:"+Calculator.objectCount());
    }
}
