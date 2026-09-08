//triangle by side 
public class Triangle{
    private double sideA;
    private double sideB;
    private double sideC;
    private static int count=0;

    public Triangle(){
        this.sideA=1.0;
        this.sideB=1.0;
        this.sideC=1.0;
        count++;
    }
    public Triangle(double sideA,double sideB,double sideC){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
        count++;
    }
    public Triangle(Triangle obj){
        this.sideA=obj.sideA;
        this.sideB=obj.sideB;
        this.sideC=obj.sideC;
        count++;
    }
    public void set(double sideA,double sideB,double sideC){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }
    public double getSideA(){
        return this.sideA;
    }
    public double getSideB(){
        return this.sideB;
    }
    public double getSideC(){
        return this.sideC;
    }
    public static int objectCount(){
        return count;
    }
    public double perimeter() {
        return this.sideA + this.sideB + this.sideC;
    }
    public boolean isRightTriangle(){
    if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
        return false;
    }
    if (sideA + sideB <= sideC ||
        sideA + sideC <= sideB ||
        sideB + sideC <= sideA) {
        return false;
    }
    return sideA * sideA + sideB * sideB == sideC * sideC ||
           sideA * sideA + sideC * sideC == sideB * sideB ||
           sideB * sideB + sideC * sideC == sideA * sideA;
    }
    public void display(){
        System.out.println("SideA: "+this.sideA +" , SideB: "+this.sideB + " , SideC: "+this.sideC);
    }
    @Override
    public String toString(){
       return "(" + this.sideA + ", " + this.sideB + ", " + this.sideC + ")";
    }
}
