public class Car extends Vehicle {
    private boolean airConditionerOn = false;


    public Car(String name, int capacity, double fuelConsumption) {
        super(name, capacity, fuelConsumption);
    }

    public void AirConditionerOn(Car car) {
        if (!car.isAirConditionerOn()) {
            car.setAirConditionerOn(true);
            car.setFuelConsumption(car.getFuelConsumption() + 0.8);
        }
    }

    public void AirConditionerOff(Car car) {
        if (car.isAirConditionerOn()) {
            car.setAirConditionerOn(false);
            car.setFuelConsumption(car.getFuelConsumption() - 0.8);
        }
    }

    public boolean isAirConditionerOn() {
        return airConditionerOn;
    }

    public void setAirConditionerOn(boolean airConditionerOn) {
        this.airConditionerOn = airConditionerOn;
    }
    public double distance(Car car){
        return (car.getCapacity()/car.getFuelConsumption())*100;
    }


    @Override
    public String toString() {
        return "Car{ NAME: " + getName() + " FUEL CONSUMPTION " + getFuelConsumption() + " CAPACITY " + getCapacity() + " " +
                "airConditionerOn=" + airConditionerOn +
                '}';
    }
}

