public class MainTriangle {
    public static void main(String[] args) {

        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        Point c = new Point(5, 6);

        Triangle t1 = new Triangle();          
        Triangle t2 = new Triangle(a,b,c);     
        Triangle t3 = new Triangle(t2); 

        t2.display();
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println("P1: " + t2.getP1());
        System.out.println("P2: " + t2.getP2());
        System.out.println("P3: " + t2.getP3());

        t1.set(a, b, c);
        System.out.println("After set(): " + t1);

        System.out.println("Total Triangle Objects: " + Triangle.objectCount());
    }
}
    

