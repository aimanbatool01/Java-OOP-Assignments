public class Triangle{
    private Point p1;
    private Point p2;
    private Point p3;
     
    private static int count = 0;

    public Triangle(){
        this.p1=new Point();
        this.p2=new Point();
        this.p3=new Point();
        count++;
    }
    public Triangle(Point p1,Point p2,Point p3){
        this.p1=new Point(p1);
        this.p2=new Point(p2);
        this.p3=new Point(p3);
        count++;

    }
    public Triangle(Triangle t){
        this.p1=new Point(t.p1);
        this.p2=new Point(t.p2);
        this.p3=new Point(t.p3);
        count++;

    }
    public static int objectCount() {
        return count;
    }
    public void set(Point p1, Point p2, Point p3) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);
    }
    public Point getP1() {
        return this.p1;
    }
    public Point getP2() {
        return this.p2;
    }
    public Point getP3() {
        return this.p3;
    }
    public void display() {
        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);
        System.out.println("Point 3: " + p3);
    }
    @Override
    public String toString() {
        return "Triangle: " + p1 + ", " + p2 + ", " + p3;
    }
}
