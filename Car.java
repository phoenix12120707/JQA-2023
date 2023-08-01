package Homework3;
public class Car {
    public int year;
    public double price;
    public boolean isSportCar;
    public double fuelTankCapacity;
    public double freeFuel;
    public String engineFuelOperationSystem;

    public void changeEngineFuelOperationSystem(String newFuelOperationSystem) {
        engineFuelOperationSystem = newFuelOperationSystem;
    }

    public void useFuel(double fuel) {
        if (fuel <= freeFuel) {
            freeFuel -= fuel;
        } else {
            System.out.println("Not enough free fuel!");
        }
    }
}