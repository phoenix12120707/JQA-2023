package Homework3;
public class CarPerson extends Car {
    public static void main(String[] args) {
        //def var

        Car car1 = new Car();
        car1.year = 1990;
        car1.price = 5000.0;
        car1.isSportCar = true;
        car1.fuelTankCapacity = 50.0;
        car1.freeFuel = 50.0;
        car1.engineFuelOperationSystem = "Petrol";

        Car car2 = new Car();
        car2.year = 2007;
        car2.price = 10000.0;
        car2.isSportCar = false;
        car2.fuelTankCapacity = 45.0;
        car2.freeFuel = 40.0;
        car2.engineFuelOperationSystem = "Diesel";


        car1.useFuel(35);
        car2.changeEngineFuelOperationSystem("GAS");

        //Print the res Car1
        System.out.println("Car 1:");
        System.out.println("Year: " + car1.year);
        System.out.println("Price: " + car1.price);
        System.out.println("Is Sport Car: " + car1.isSportCar);
        System.out.println("Fuel Tank Capacity: " + car1.fuelTankCapacity);
        System.out.println("Free Fuel: " + car1.freeFuel);
        System.out.println("Engine Fuel Operation System: " + car1.engineFuelOperationSystem);

        System.out.println();
        //Print Car2
        System.out.println("Car 2:");
        System.out.println("Year: " + car2.year);
        System.out.println("Price: " + car2.price);
        System.out.println("Is Sport Car: " + car2.isSportCar);
        System.out.println("Fuel Tank Capacity: " + car2.fuelTankCapacity);
        System.out.println("Free Fuel: " + car2.freeFuel);
        System.out.println("Engine Fuel Operation System: " + car2.engineFuelOperationSystem);
    }
}
