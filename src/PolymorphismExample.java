class Vehicle {
    public void display() {
        System.out.println("This is the Vehicle class.");
    }
}

class Car extends Vehicle {
    @Override
    public void display() {
        System.out.println("This is the Car class.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args){
        Vehicle v1 = new Vehicle();
        Car c1 = new Car();

        
        Vehicle vehicle = v1;
        vehicle.display();

        vehicle = c1;
        vehicle.display();
    }
}

