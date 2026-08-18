public class MainCar {
    public static void main(String[] args) {
    Car c1=new Car ();
    Car c2= new Car("Toyota","Black",150,50);
    Car c3 = new Car (c2);
    
    c1.display();
    System.out.println();
    c2.display();
    System.out.println();
    c3.display();
    System.out.println();

    c1.set("Honda","White",190,45);
    c1.display();
    System.out.println();
    
    System.out.println("Getters:");
    System.out.println("Brand: " + c1.getBrand());
    System.out.println("Color: " + c1.getColor());
    System.out.println("Speed: " + c1.getSpeed());
    System.out.println("Fuel Capacity: " + c1.getFuelCapacity());

    System.out.println();

    System.out.println(c2);

    System.out.println("objectcount:"+ Car.objectCount());
    }
}
