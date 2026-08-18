public class Calculator {
    private double num1;
    private double num2;

    private static int count;

    public Calculator(){
        this.num1=0;
        this.num2=0;
        count++;
    }
    public Calculator(double num1,double num2){
        this.num1=num1;
        this.num2=num2;
        count++;
    }
    public Calculator(Calculator obj){
        this.num1=obj.num1;
        this.num2=obj.num2;
        count++;
    }
    public void set(double num1,double num2){
        this.num1=num1;
        this.num2=num2;
    }
    public double getNum1(){
        return this.num1;
    }
    public double getNum2(){
        return this.num2;
    }
    public static int objectCount(){
        return count;
    }
    public double add(){
        return num1+num2;
    }
    public double subtract(){
        return num1-num2;
    }
    public double multiply(){
        return num1 * num2;
    }
    public double divide(){
        return num1 / num2;
    }
    public void display(){
        System.out.println("num1:"+num1);
        System.out.println("num2:"+num2);
    }
    @Override
    public String toString() {
        return "Calculator [num1=" + num1 + ", num2=" + num2 + "]";
    }
}
