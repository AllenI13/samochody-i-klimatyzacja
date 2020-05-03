public class Vehicle {
    private String name;
    private int capacity;
    private double fuelConsumption; // consumption per 100km

    public Vehicle(String name, int capacity, double fuelConsumption) {
        this.name = name;
        this.capacity = capacity;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }


}
