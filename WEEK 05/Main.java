public class Main{
    public static void main(String[] args){

        Point p = new Point(5, 0);
        Circle c = new Circle(p, 10);
        c.display();
        System.out.println("Center on X-Axis: " + c.isCenterOnXAxis());
    }
}