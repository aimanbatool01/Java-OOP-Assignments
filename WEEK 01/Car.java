public class Car{
    private String brand;
    private String color;
    private double speed;
    private double fuelCapacity;

    public static int count=0;

    public Car(){
        this.brand="Unknown";
        this.color="Unknown";
        this.speed=0;
        this.fuelCapacity=0;
        count++;
    }
    public Car(String brand,String color,double speed,double fuelCapacity){
        this.brand=brand;
        this.color=color;
        this.speed=speed;
        this.fuelCapacity=fuelCapacity;
        count++;
    }
    public Car(Car obj ){
        this.brand=obj.brand;
        this.color=obj.color;
        this.speed=obj.speed;
        this.fuelCapacity=obj.fuelCapacity;
        count++;
    }
    public void set(String brand,String color,double speed,double fuelCapacity){
        this.brand=brand;
        this.color=color;
        this.speed=speed;
        this.fuelCapacity=fuelCapacity;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getColor(){
        return this.color;
    }
    public double getSpeed(){
        return this.speed;
    }
    public double getFuelCapacity(){
        return this.fuelCapacity;
    }
    public static int objectCount(){
        return count;
    }
    public void display(){
        System.out.println("Brand:"+ brand);
        System.out.println("Color:"+color);
        System.out.println("Speed:"+speed);
        System.out.println("fuelCapacity:"+fuelCapacity);
    }
    @Override
    public String toString() {
        return "Car{brand='" + brand + "', color='" + color +
               "', speed=" + speed + ", fuelCapacity=" + fuelCapacity + "}";
    }
}
