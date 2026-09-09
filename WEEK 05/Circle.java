public class Circle{
    private Point cen;
    private double radius;

    public Circle(){
        this.cen = new Point();
        this.radius = 0;
    }
    public Circle(Point cen, double radius){
        this.cen = new Point(cen);
        this.radius = radius;
    }
    public Circle(Circle c) {
        this.cen = new Point(c.cen);
        this.radius = c.radius;
    }
    public void setCen(Point cen){
        this.cen = new Point(cen);
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Point getCen() {
        return new Point(this.cen);
    }
    public double getRadius() {
        return this.radius;
    }
    public boolean isCenterOnXAxis() {
    if (this.cen == null)
        throw new NullPointerException("Center cannot be null");

        return this.cen.getY() == 0;
    }
    public void display() {
        System.out.println("Center: " + this.cen);
        System.out.println("Radius: " + this.radius);
    }
    public String toString() {
        return "Circle [Center=" + this.cen + ", Radius=" + this.radius + "]";
    }
}