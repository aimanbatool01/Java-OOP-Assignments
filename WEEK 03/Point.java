public class Point{
    private double x;
    private double y;

    public Point(){
        this.x= 0;
        this.y= 0;
    }
    public Point(double x,double y){
        this.x= x;
        this.y= y;
    }
    public Point(Point p){
        this.x= p.x;
        this.y= p.y;
    }
    public void set(double x,double y){
        this.x= x;
        this.y= y;
    }
    public double getX(){
        return this.x;

    }
    public double getY(){
        return this.y;
    }
    public void display(){
        System.out.println("x = "+ this.x);
        System.out.println("y = "+ this.y);
    }
    @Override
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }
}