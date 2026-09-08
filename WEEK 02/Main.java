public class Main{
    public static void main(String[] args) {
        Triangle t1= new Triangle();
        Triangle t2= new Triangle(6,8,10);
        Triangle t3=new Triangle(t2);
        
        t1.display();
        t2.display();
        t3.display();
        System.out.println();

        System.out.println("Perimeter: " + t2.perimeter());
        System.out.println("Right Triangle: " + t2.isRightTriangle());

        t1.set(4,4,4);
        t1.display();
        System.out.println();

        System.out.println("SideA:" + t1.getSideA());
        System.out.println("SideB:" + t1.getSideB());
        System.out.println("SideC:" + t1.getSideC());

        System.out.println("objectCount: " + Triangle.objectCount());
    }
}