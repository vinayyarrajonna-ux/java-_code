class Vehicle {
    String brand;

    void start() {
        System.out.println("The vehicle is starting");
    }
}

class Car extends Vehicle {
    String modelName;

    void accelerate() {
        System.out.println("The car is accelerating");
    }

    public static void main(String[] args) {
        Car c = new Car();

        c.brand = "Toyota";
        c.modelName = "Fortuner";

        System.out.println(c.brand);
        System.out.println(c.modelName);

        c.start();
        c.accelerate();
    }
}
